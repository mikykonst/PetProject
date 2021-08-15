package com.company.service;

import com.company.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserService extends CrudRepository<User, Long> {
    User create(String username, int age, long accountId);

    User updateUser(Long id);

    boolean deleteUser(Long id);
}
