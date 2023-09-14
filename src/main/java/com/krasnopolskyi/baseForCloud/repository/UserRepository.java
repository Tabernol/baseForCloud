package com.krasnopolskyi.baseForCloud.repository;

import com.krasnopolskyi.baseForCloud.entity.User;

import java.util.List;

public interface UserRepository {

    User save(User user);

    List<User> getAll();

}
