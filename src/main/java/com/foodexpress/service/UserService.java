package com.foodexpress.service;

import com.foodexpress.dto.UserDto;

import java.util.List;

public interface UserService {

    UserDto saveUser(UserDto user);
    UserDto updateUser(UserDto user, String userId);

    void deleteUser(String userId);
    UserDto getUser(String userId);
    UserDto getUserByEmail(String email);
    List<UserDto> getUsers();
    List<UserDto> searchUserName(String keyword);


}
