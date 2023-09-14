package com.krasnopolskyi.baseForCloud.entity;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class User {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private LocalDateTime birthDate;
    private Role role;

    public enum Role{
        ADMIN, USER
    }
}
