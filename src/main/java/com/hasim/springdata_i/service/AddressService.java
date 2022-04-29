package com.hasim.springdata_i.service;

import com.hasim.springdata_i.dto.AddressDto;
import com.hasim.springdata_i.dto.CategoryDto;
import com.hasim.springdata_i.entity.Address;
import com.hasim.springdata_i.entity.Category;

import java.util.List;

public interface AddressService {
    void save(Address p);

    void delete(int id);

    AddressDto getById(int id);

    List<AddressDto> getAll();
}
