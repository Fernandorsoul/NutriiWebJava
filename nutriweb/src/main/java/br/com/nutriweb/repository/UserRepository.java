package br.com.nutriweb.NutriWeb.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import br.com.nutriweb.NutriWeb.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
