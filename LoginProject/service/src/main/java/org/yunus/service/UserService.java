package org.yunus.service;

import org.yunus.dto.UserDto;
import org.yunus.entities.User;
import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();
}
