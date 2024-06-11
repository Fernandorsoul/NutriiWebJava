package br.com.nutriweb.NutriWeb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import antlr.collections.List;
import br.com.nutriweb.NutriWeb.entity.Meal;

public interface MealRepository extends JpaRepository<Meal, Long> {
    List findByDietId(Long dietId);
}