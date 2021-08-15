package com.company.service.impl;


import com.company.entity.User;
import com.company.repository.UserRepository;
import com.company.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User create(String username, int age, long accountId) {
        return null;
    }

    @Override
    public User updateUser(Long id) {
        return null;
    }

    @Override
    public boolean deleteUser(Long id) {
        userRepository.deleteEntity(id);

        return true;
    }

    @Override
    public <S extends User> S save(S s) {
        return null;
    }

    @Override
    public <S extends User> Iterable<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<User> findById(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public Iterable<User> findAllById(Iterable<Long> ids) {
        return userRepository.findAllById(ids);
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public void delete(User user) {
        userRepository.delete(user);
    }

    @Override
    public void deleteAllById(Iterable<? extends Long> ids) {
        userRepository.deleteAllById(ids);
    }

    @Override
    public void deleteAll(Iterable<? extends User> users) {
        userRepository.deleteAll(users);
    }

    @Override
    public void deleteAll() {
        userRepository.deleteAll();
    }
}
