package com.oguz.stock.user.port;

import com.oguz.stock.user.model.User;
import com.oguz.stock.user.usecase.CreateUser;

import java.util.List;

public interface UserPort {
    User getUserById(long id);
    List<User> getAll();
    User createUser(CreateUser user);
}
