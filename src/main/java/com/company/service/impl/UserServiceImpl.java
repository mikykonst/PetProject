package com.company.service.impl;


import com.company.entity.User;
import com.company.repository.UserRepository;
import com.company.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository repository;

    @Override
    public User create(String username, int age, long accountId) {
        User user = new User();
        user.setUsername(username);
        user.setAge(age);
        user.setAccountId(accountId);

        return repository.save(user);
    }

    @Override
    public User updateUser(User user) {
        return null;
    }

    @Override
    public boolean deleteUser(Long id) {
        repository.deleteById(id);
        Optional<User> users = repository.findById(id);

        return users.stream().findAny().isEmpty();
    }
}
