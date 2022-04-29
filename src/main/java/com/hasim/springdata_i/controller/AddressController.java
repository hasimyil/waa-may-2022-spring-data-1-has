package com.hasim.springdata_i.controller;


import com.hasim.springdata_i.dto.AddressDto;
import com.hasim.springdata_i.entity.Address;
import com.hasim.springdata_i.service.AddressService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/address")
public class AddressController {

    private final AddressService AddressService;
    public AddressController(AddressService AddressService){
        this.AddressService = AddressService;
    }

    @PostMapping
    public void save(@RequestBody Address p) {
        AddressService.save(p);
    }
    @DeleteMapping
    public void deleteById(@RequestParam int p) {
        AddressService.delete(p);
    }


    @GetMapping
    public List<AddressDto> getAll() {
        return AddressService.getAll();
    }
    @GetMapping("/{id}")
    public AddressDto getById(@RequestParam int id) {
        return AddressService.getById(id);
    }

}
