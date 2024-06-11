package br.com.nutriweb.NutriWeb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import antlr.collections.List;
import br.com.nutriweb.NutriWeb.entity.Diet;

public interface DietRepository extends JpaRepository<Diet, Long> {
    java.util.List<Diet> findByUserId(Long userId);
}
