package com.krasnopolskyi.baseForCloud.service;

import com.krasnopolskyi.baseForCloud.entity.User;
import com.krasnopolskyi.baseForCloud.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User save(User user) {
        return userRepository.save(user);
    }

    public List<User> getAll() {
        return userRepository.getAll();
    }
}
