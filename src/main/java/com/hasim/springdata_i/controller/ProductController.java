package com.hasim.springdata_i.controller;


import com.hasim.springdata_i.dto.ProductDto;
import com.hasim.springdata_i.entity.Product;
import com.hasim.springdata_i.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }


    @PostMapping
    public void save(@RequestBody Product p) {
        productService.save(p);
    }
    @DeleteMapping
    public void deleteById(@RequestParam int p) {
        productService.delete(p);
    }
    @GetMapping
    public List<ProductDto> getAll() {
        return productService.getAll();
    }
    @GetMapping("/{id}")
    public ProductDto getById(@RequestParam int id) {
        return productService.getById(id);
    }


}
