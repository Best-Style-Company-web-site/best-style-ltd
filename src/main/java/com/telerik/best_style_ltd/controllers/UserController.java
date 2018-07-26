package com.telerik.best_style_ltd.controllers;

import com.telerik.best_style_ltd.entities.User;
import com.telerik.best_style_ltd.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/users")
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/add")
    public void addUser(@RequestBody User user) {
        this.userService.addUser(user);
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable("id") String id) {
        return userService.getUserById(Integer.parseInt(id));
    }

    @DeleteMapping("/delete/{id}")
    public void removeUser(@PathVariable("id") String id) {
       userService.removeUser(Integer.parseInt(id));
    }
}
