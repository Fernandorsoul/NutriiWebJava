package br.com.nutriweb.NutriWeb.service;

import java.util.Optional;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.nutriweb.NutriWeb.entity.Diet;
import br.com.nutriweb.NutriWeb.repository.DietRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DietService {
    private final DietRepository dietRepository;

    public Diet save(Diet diet) {
        return dietRepository.save(diet);
    }

    public Optional<Diet> findById(Long id) {
        return dietRepository.findById(id);
    }

    public Optional<Diet> update(Long id, Diet diet) {
        return dietRepository.findById(id)
                .map(existingDiet -> {
                    existingDiet.setName(diet.getName());
                    existingDiet.setDescription(diet.getDescription());
                    return dietRepository.save(existingDiet);
                });
    }

    public boolean delete(Long id) {
        if (dietRepository.existsById(id)) {
            dietRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public List<Diet> findByUserId(Long userId) {
        return dietRepository.findByUserId(userId);
    }
}
