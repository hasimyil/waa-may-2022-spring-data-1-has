package com.hasim.springdata_i.entity.joinedcolumn;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.hasim.springdata_i.entity.Product;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class ReviewJoinedColumn {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String comment;
    private int numberOfStars;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "product_id")
    private Product product;
}
