package com.user.service.services;

import com.user.service.entities.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    List<User> getAllUser();
    User getUser(String userId);
    User updateUser(String userId, User user);
    String deleteUser(String userId);
}
