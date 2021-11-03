package com.workshop.springsecurity.service;

import com.workshop.springsecurity.data.model.UserEntity;
import com.workshop.springsecurity.data.repository.UserEntityRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
@Slf4j
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserEntityRepository repository;
    private final PasswordEncoder encoder;

    @Override
    public Optional<UserEntity> getUser(String username, String password) {
        log.debug("User Name : {} try to execute service", username);
        Optional<UserEntity> userEntity = repository.findByUsername(username);
        /**
         * BCryptPasswordEncoder encode same string with different output ant time.
         * So you can compare plain string is equal to encoded string with "matches" method
         * Related thread : https://stackoverflow.com/a/34210582
         * */
        if (userEntity.isPresent() && encoder.matches(password, userEntity.get().getPassword())) {
            log.debug("User Name : {} access granted", username);
            return userEntity;
        }
        log.warn("User Name : {} access denied", username);
        return Optional.empty();
    }

}
