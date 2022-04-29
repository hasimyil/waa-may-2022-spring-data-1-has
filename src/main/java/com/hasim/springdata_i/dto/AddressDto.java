package com.hasim.springdata_i.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AddressDto {
    private int id;
    private String street;
    private String city;
    private  int zip;

}
