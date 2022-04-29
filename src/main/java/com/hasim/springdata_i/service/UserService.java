package com.hasim.springdata_i.service;

import com.hasim.springdata_i.dto.ProductDto;

import com.hasim.springdata_i.dto.UserDto;
import com.hasim.springdata_i.entity.User;

import java.util.List;

public interface UserService {
    void save(User p);

    void delete(int id);

    UserDto getById(int id);

    List<UserDto> getAll();
}
