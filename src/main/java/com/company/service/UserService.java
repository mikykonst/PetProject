package com.company.service;

import com.company.entity.User;

public interface UserService {
    User create(String username, int age, long accountId);

    User updateUser(User id);

    boolean deleteUser(Long id);
}
