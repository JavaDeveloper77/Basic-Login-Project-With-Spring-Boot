package com.yunus.Login.Service;



import com.yunus.Login.DTO.UserDto;
import com.yunus.Login.Entity.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();
}
