package com.hasim.springdata_i.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserDto {
    private int id;
    private String email;
    private String password;
    private String firstName;
    private String lastname;

}
