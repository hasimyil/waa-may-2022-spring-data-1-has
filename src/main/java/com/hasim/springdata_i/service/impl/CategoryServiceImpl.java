package com.hasim.springdata_i.service.impl;

import com.hasim.springdata_i.dto.CategoryDto;
import com.hasim.springdata_i.dto.UserDto;
import com.hasim.springdata_i.entity.Category;
import com.hasim.springdata_i.entity.User;
import com.hasim.springdata_i.repository.CategoryRepo;
import com.hasim.springdata_i.repository.UserRepo;
import com.hasim.springdata_i.service.CategoryService;
import com.hasim.springdata_i.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepo categoryRepo;

    @Override
    public void save(Category p) {
        categoryRepo.save(p);
    }

    @Override
    public void delete(int id) {
        categoryRepo.deleteById(id);
    }

    @Override
    public CategoryDto getById(int id) {
        CategoryDto result = new CategoryDto();
        var item = categoryRepo.findById(id).get();
        result.setName(item.getName());
        result.setId(item.getId());

        return result;
    }

    @Override
    public List<CategoryDto> getAll() {
        var result= new ArrayList<CategoryDto>();
        categoryRepo.findAll().forEach(item -> {
            CategoryDto p = new CategoryDto();
            p.setId(item.getId());
            p.setName(p.getName());
            result.add(p);
        });

        return result;
    }
}
