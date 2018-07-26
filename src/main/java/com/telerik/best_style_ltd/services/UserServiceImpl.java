package com.telerik.best_style_ltd.services;

import com.telerik.best_style_ltd.entities.User;
import com.telerik.best_style_ltd.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void addUser(User u) {
        userRepository.addUser(u);
    }

    @Override
    public void updateUser(User u) {

    }

    @Override
    public List<User> listUsers() {
        return null;
    }

    @Override
    public User getUserById(int id) {
        return userRepository.getUserById( id );
    }

    @Override
    public void removeUser(int id) {
        userRepository.removeUser(id);
    }
}
