package com.telerik.best_style_ltd.repositories;

import com.telerik.best_style_ltd.entities.User;

import java.util.*;

public interface UserRepository {

    void addUser(User user);

    void updateUser(User user);

    List<User> listUsers();

    User getUserById(int id);

    void removeUser(int id);
}
