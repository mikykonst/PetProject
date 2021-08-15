package com.company.repository;

import com.company.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;

public interface UserRepository extends JpaRepository<User, Long> {

    @Transactional
    @Modifying
    @Query("delete from User u where u.id=?1")
    public void deleteEntity(Long id);
}
