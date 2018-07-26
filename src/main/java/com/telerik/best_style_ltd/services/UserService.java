package com.telerik.best_style_ltd.services;

import com.telerik.best_style_ltd.entities.User;

import java.util.List;

public interface UserService {

    void addUser(User u);
    void updateUser(User u);
    List<User> listUsers();
    User getUserById(int id);
    void removeUser(int id);
}
