package com.devops.userservice.service;

import com.devops.userservice.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    public List<User> getAllUsers() {
        return List.of(
                new User(1, "Anuj"),
                new User(2, "DevOps Ninja")
        );
    }
}