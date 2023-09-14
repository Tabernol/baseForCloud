package com.krasnopolskyi.baseForCloud.repository;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepositoryImpl implements  UserRepository{
    private final JdbcTemplate jdbcTemplate;

    private static final String INSERT_USER = "INSERT INTO USERS VALUES(DEFAULT, ?,?,?,?,?)";

    public UserRepositoryImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }



}
