package com.redhat.User.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.*;
import jakarta.persistence.*;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;

    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<User> getUserById(Long userId) {
        return userRepository.findById(userId);
    }

    @Transactional
    public void createUser(User userData) {

        entityManager.createNativeQuery("INSERT INTO service_user(fullname, username, email, user_role) VALUES (?,?,?,?)")
                .setParameter(1, userData.getFullname())
                .setParameter(2, userData.getUsername())
                .setParameter(3, userData.getEmail())
                .setParameter(4, userData.getUserRole())
                .executeUpdate();
    }
}