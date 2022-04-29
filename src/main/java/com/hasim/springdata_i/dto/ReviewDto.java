package com.hasim.springdata_i.dto;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.hasim.springdata_i.entity.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.ManyToOne;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ReviewDto {
    private int id;
    private String comment;
    private int numberOfStars;

    private Product product;

}
