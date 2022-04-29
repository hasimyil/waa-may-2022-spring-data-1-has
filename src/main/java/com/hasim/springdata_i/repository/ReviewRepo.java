package com.hasim.springdata_i.repository;

import com.hasim.springdata_i.entity.Address;
import com.hasim.springdata_i.entity.Review;
import org.springframework.data.repository.CrudRepository;

public interface ReviewRepo extends CrudRepository<Review,Integer> {
}
