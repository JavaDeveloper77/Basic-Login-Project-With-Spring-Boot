package com.yunus.login.Service;

import com.yunus.login.DTO.UserDto;
import com.yunus.login.Entities.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();
}