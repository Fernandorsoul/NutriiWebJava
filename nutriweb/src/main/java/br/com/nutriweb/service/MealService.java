package br.com.nutriweb.NutriWeb.service;

import java.util.Optional;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.nutriweb.NutriWeb.entity.Meal;
import br.com.nutriweb.NutriWeb.repository.MealRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MealService {
    private final MealRepository mealRepository;

    public Meal save(Meal meal) {
        return mealRepository.save(meal);
    }

    public Optional<Meal> findById(Long id) {
        return mealRepository.findById(id);
    }

    public Optional<Meal> update(Long id, Meal meal) {
        return mealRepository.findById(id)
                .map(existingMeal -> {
                    existingMeal.setName(meal.getName());
                    existingMeal.setDate(meal.getDate());
                    return mealRepository.save(existingMeal);
                });
    }

    public boolean delete(Long id) {
        if (mealRepository.existsById(id)) {
            mealRepository.deleteById(id);
            return true;
        }
        return false;
    }

    @SuppressWarnings("unchecked")
	public List<Meal> findByDietId(Long dietId) {
        return (List<Meal>) mealRepository.findByDietId(dietId);
    }
}
