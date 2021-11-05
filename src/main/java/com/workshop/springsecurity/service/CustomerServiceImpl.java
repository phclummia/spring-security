package com.workshop.springsecurity.service;

import com.workshop.springsecurity.data.model.CustomerEntity;
import com.workshop.springsecurity.data.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements  CustomerService{

    private  final CustomerRepository repository;

    @Override
    public Iterable<CustomerEntity> getAll() {
        return repository.findAll();
    }
}
