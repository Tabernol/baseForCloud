package com.krasnopolskyi.baseForCloud.entity;

import lombok.Builder;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Builder
public class User {
    private Long id;
    private String firstName;
    private String lastName;
    private String login;
    private String password;
    private LocalDate birthDate;
    private Role role;

    public enum Role{
        ADMIN, USER
    }
}
