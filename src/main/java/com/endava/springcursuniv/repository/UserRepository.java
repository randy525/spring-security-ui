package com.endava.springcursuniv.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.endava.springcursuniv.model.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
    UserEntity findByUsername(String username);
}
