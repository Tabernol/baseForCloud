package com.krasnopolskyi.baseForCloud.repository;

import com.krasnopolskyi.baseForCloud.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Repository
@Slf4j
public class UserRepositoryImpl implements UserRepository {
    private final JdbcTemplate jdbcTemplate;

    private static final String INSERT_USER =
            "INSERT INTO users (id, firstname, lastname, login, password, birth_date, role) " +
                    "VALUES (DEFAULT, ?,?,?,?,?,?)";

    private final static String GET_ALL =
            "SELECT id, firstname, lastname, login, birth_date, role from users";

    public UserRepositoryImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    @Override
    public User save(User user) {
        jdbcTemplate.update(INSERT_USER, (ps -> {
            ps.setString(1, user.getFirstName());
            ps.setString(2, user.getLastName());
            ps.setString(3, user.getLogin());
            ps.setString(4, user.getPassword());
            ps.setDate(5, Date.valueOf(user.getBirthDate()));
            ps.setString(6, user.getRole().name());
        }));

        // to do return
        return user;
    }

    @Override
    public List<User> getAll() {
        return jdbcTemplate.query(GET_ALL, new RowMapper<User>() {
            @Override
            public User mapRow(ResultSet rs, int rowNum) throws SQLException {
                return User.builder()
                        .id(rs.getLong("id"))
                        .firstName(rs.getString("firstname"))
                        .lastName(rs.getString("lastname"))
                        .login(rs.getString("login"))
                        .birthDate(rs.getDate("birth_date").toLocalDate())
                        .role(User.Role.valueOf(rs.getString("role")))
                        .build();
            }
        });
    }
}
