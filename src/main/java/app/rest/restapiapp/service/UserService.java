package app.rest.restapiapp.service;

import app.rest.restapiapp.dto.UserDto;
import app.rest.restapiapp.entity.User;

import java.util.List;

public interface UserService {
    UserDto createUser(UserDto user);// CreateUser method

    UserDto getUserById(Long userId);// GetUserById method

    List<UserDto> getAllUsers();// GetAllUsers method

    UserDto updateUser(UserDto user);

    void deleteUserById(Long userId);
}
