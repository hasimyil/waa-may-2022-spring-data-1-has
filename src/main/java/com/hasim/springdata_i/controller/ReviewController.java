package com.hasim.springdata_i.controller;


import com.hasim.springdata_i.dto.ReviewDto;
import com.hasim.springdata_i.entity.Review;
import com.hasim.springdata_i.service.ReviewService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/reviews")
public class ReviewController {

    private final ReviewService ReviewService;
    public ReviewController(ReviewService ReviewService){
        this.ReviewService = ReviewService;
    }

    @PostMapping
    public void save(@RequestBody Review p) {
        ReviewService.save(p);
    }
    @DeleteMapping
    public void deleteById(@RequestParam int p) {
        ReviewService.delete(p);
    }


    @GetMapping
    public List<ReviewDto> getAll() {
        return ReviewService.getAll();
    }
    @GetMapping("/{id}")
    public ReviewDto getById(@RequestParam int id) {
        return ReviewService.getById(id);
    }

}
