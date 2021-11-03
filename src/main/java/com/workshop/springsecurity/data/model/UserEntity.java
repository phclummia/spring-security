package com.workshop.springsecurity.data.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "USERS_CUSTOM")
@Data
public class UserEntity {

    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "username", nullable = false, unique = true, updatable = true, length = 60)
    private String username;
    @Column(name = "password", nullable = false, unique = true, updatable = true, length = 60)
    private String password;
    @Column(name = "role", nullable = false, unique = true, updatable = true, length = 60)
    private String role;
}
