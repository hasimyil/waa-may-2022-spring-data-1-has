package com.hasim.springdata_i.repository;

import com.hasim.springdata_i.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<User,Integer> {
}
