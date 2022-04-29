package com.hasim.springdata_i.service;

import com.hasim.springdata_i.dto.ProductDto;
import com.hasim.springdata_i.entity.Product;

import java.util.List;

public interface ProductService {
    void save(Product p);

    void delete(int id);

    ProductDto getById(int id);

    List<ProductDto> getAll();
}
