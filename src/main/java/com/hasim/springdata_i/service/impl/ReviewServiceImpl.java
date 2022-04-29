package com.hasim.springdata_i.service.impl;

import com.hasim.springdata_i.dto.ReviewDto;
import com.hasim.springdata_i.entity.Address;
import com.hasim.springdata_i.entity.Review;
import com.hasim.springdata_i.repository.ReviewRepo;
import com.hasim.springdata_i.service.ReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class ReviewServiceImpl implements ReviewService {
    private final ReviewRepo ReviewRepo;

    @Override
    public void save(Review p) {
        ReviewRepo.save(p);
    }



    @Override
    public void delete(int id) {
        ReviewRepo.deleteById(id);
    }

    @Override
    public ReviewDto getById(int id) {
        ReviewDto result = new ReviewDto();
        var item = ReviewRepo.findById(id).get();
        result.setComment(item.getComment());
        result.setId(item.getId());
        result.setProduct(item.getProduct());
        result.setNumberOfStars(item.getNumberOfStars());

        return result;
    }

    @Override
    public List<ReviewDto> getAll() {
        var result= new ArrayList<ReviewDto>();
        ReviewRepo.findAll().forEach(item -> {
            ReviewDto p = new ReviewDto();
            p.setId(item.getId());
            p.setComment(item.getComment());
            p.setProduct(item.getProduct());
            p.setNumberOfStars(item.getNumberOfStars());
            result.add(p);
        });

        return result;
    }
}
