package com.workshop.springsecurity.service;

import com.workshop.springsecurity.data.model.CustomerEntity;

import java.util.List;

public interface CustomerService {

    public Iterable<CustomerEntity> getAll();
}
