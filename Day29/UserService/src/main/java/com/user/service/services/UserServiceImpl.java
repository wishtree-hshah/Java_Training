package com.user.service.services;

import com.user.service.entities.User;
import com.user.service.exceptions.UserNotFoundException;
import com.user.service.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public User getUser(String userId) {
        Optional<User> optionalUser = userRepository.findById(userId);
        User user;
        if (optionalUser.isPresent()) {
            user = optionalUser.get();
        } else {
            throw new UserNotFoundException("User not found");
        }
        return user;
    }

    @Override
    public User updateUser(String userId, User user) {
        User existingUser = getUser(userId);

        existingUser.setName(user.getName());
        existingUser.setAbout(user.getAbout());
        existingUser.setEmail(user.getEmail());
        return userRepository.save(existingUser);
    }

    @Override
    public String deleteUser(String userId) {
        if (userRepository.existsById(userId)) {
            userRepository.deleteById(userId);
            return "User deleted successfully";
        } else {
            throw new UserNotFoundException("User not found");
        }
    }
}
