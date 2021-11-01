package com.workshop.springsecurity.controller;

import com.workshop.springsecurity.model.ResourceModel;
import org.springframework.web.bind.annotation.RestController;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

@RestController
public class SecurityControllerImpl implements SecurityController {
    @Override
    public ResourceModel get() throws NoSuchAlgorithmException {
        return ResourceModel.builder()
                .key("Resource Key")
                .value("Resource Value")
                .id(Math.abs(SecureRandom.getInstance("SHA1PRNG").nextLong()))
                .build();
    }

    @Override
    public ResourceModel post(ResourceModel request) throws NoSuchAlgorithmException {
        return ResourceModel.builder()
                .key("Resource Key")
                .value("Resource Value")
                .id(Math.abs(SecureRandom.getInstance("SHA1PRNG").nextLong()))
                .build();
    }
}
