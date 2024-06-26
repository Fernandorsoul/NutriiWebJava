package br.com.nutriweb.nutriweb.services;

import br.com.nutriweb.nutriweb.entity.User;
import br.com.nutriweb.nutriweb.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public Optional<User> findById(UUID userId) {
        return userRepository.findById(userId);
    }

    public User save(User user) {
        return userRepository.save(user);
    }

    public void deleteById(UUID userId) {
        userRepository.deleteById(userId);
    }
}