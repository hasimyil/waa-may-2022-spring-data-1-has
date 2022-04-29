package com.hasim.springdata_i.service;

import com.hasim.springdata_i.dto.ReviewDto;
import com.hasim.springdata_i.entity.Address;
import com.hasim.springdata_i.entity.Review;

import java.util.List;

public interface ReviewService {
    void save(Review p);

    void delete(int id);

    ReviewDto getById(int id);

    List<ReviewDto> getAll();
}
