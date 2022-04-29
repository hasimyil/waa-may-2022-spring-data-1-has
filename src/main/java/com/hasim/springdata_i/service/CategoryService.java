package com.hasim.springdata_i.service;

import com.hasim.springdata_i.dto.CategoryDto;
import com.hasim.springdata_i.dto.UserDto;
import com.hasim.springdata_i.entity.Category;
import com.hasim.springdata_i.entity.User;

import java.util.List;

public interface CategoryService {
    void save(Category p);

    void delete(int id);

    CategoryDto getById(int id);

    List<CategoryDto> getAll();
}
