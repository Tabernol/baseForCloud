package com.krasnopolskyi.baseForCloud.mapper;

import com.krasnopolskyi.baseForCloud.dto.UserPostDto;
import com.krasnopolskyi.baseForCloud.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@Slf4j
public class UserMapper {

    public User mapToUser(UserPostDto userPostDto) {;
        return User.builder()
                .firstName(userPostDto.getFirstname())
                .lastName(userPostDto.getLastname())
                .login(userPostDto.getLogin())
                .password(userPostDto.getPassword())
                .role(User.Role.USER)
                .birthDate(userPostDto.getBirthDate())
                .build();
    }
}
