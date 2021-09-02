package com.company.controller;

import com.company.entity.User;
import com.company.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class UserApiController {
    private final UserService userService;

    @PostMapping("/user")
    User newUser(@RequestBody User newUser) {
        return userService.create(newUser.getUsername(), newUser.getAge(), newUser.getAccountId());
    }

    @PutMapping("/user")
    User updateUser(@RequestBody User updatedUser) {
        return userService.updateUser(updatedUser);
    }

    @DeleteMapping("/user")
    boolean deleteUser(@RequestBody long userId) {
        return userService.deleteUser(userId);
    }
}
