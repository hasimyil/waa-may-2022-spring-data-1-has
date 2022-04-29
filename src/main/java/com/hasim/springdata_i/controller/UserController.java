package com.hasim.springdata_i.controller;


import com.hasim.springdata_i.dto.ProductDto;
import com.hasim.springdata_i.dto.UserDto;
import com.hasim.springdata_i.entity.Product;
import com.hasim.springdata_i.entity.User;
import com.hasim.springdata_i.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    private final UserService userService;
    public UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping
    public void save(@RequestBody User p) {
        userService.save(p);
    }
    @DeleteMapping
    public void deleteById(@RequestParam int p) {
        userService.delete(p);
    }
    @GetMapping
    public List<UserDto> getAll() {
        return userService.getAll();
    }
    @GetMapping("/{id}")
    public UserDto getById(@RequestParam int id) {
        return userService.getById(id);
    }

}
