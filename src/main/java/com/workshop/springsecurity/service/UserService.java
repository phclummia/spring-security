package com.workshop.springsecurity.service;

import com.workshop.springsecurity.data.model.UserEntity;

import java.util.Optional;

public interface UserService {
    Optional<UserEntity> getUser(String username, String password);
}
