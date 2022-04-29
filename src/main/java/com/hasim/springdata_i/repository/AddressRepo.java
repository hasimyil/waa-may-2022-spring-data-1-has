package com.hasim.springdata_i.repository;

import com.hasim.springdata_i.entity.Address;
import com.hasim.springdata_i.entity.Category;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepo extends CrudRepository<Address,Integer> {
}
