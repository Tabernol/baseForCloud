package com.krasnopolskyi.baseForCloud.dto;

import com.krasnopolskyi.baseForCloud.entity.User;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.LocalDateTime;
@Data
public class UserPostDto {
    private String firstname;
    private String lastname;
    private String login;
    private String password;
    @DateTimeFormat(pattern = "YYYY-MM-DD")
    private LocalDate birthDate;
    private User.Role role;
}

