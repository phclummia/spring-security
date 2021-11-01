package com.workshop.springsecurity.controller;

import com.workshop.springsecurity.model.ResourceModel;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.security.NoSuchAlgorithmException;

@Validated
@RequestMapping(value = "/api/v1/security")
public interface SecurityController {

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    ResourceModel get() throws NoSuchAlgorithmException;

    @RequestMapping(value = "/post", method = RequestMethod.POST)
    ResourceModel post(ResourceModel request) throws NoSuchAlgorithmException;
}
