package com.artbook.users.service;

import com.artbook.users.model.User;
import com.artbook.users.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> findAllUsers() {
        return (List<User>) userRepository.findAll();
    }

    public User findUserById(long userId) {
        final Optional<User> byId = userRepository.findById(userId);
        return byId.orElse(null);
    }
}
