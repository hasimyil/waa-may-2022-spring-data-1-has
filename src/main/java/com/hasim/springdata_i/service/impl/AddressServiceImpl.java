package com.hasim.springdata_i.service.impl;

import com.hasim.springdata_i.dto.AddressDto;
import com.hasim.springdata_i.entity.Address;
import com.hasim.springdata_i.repository.AddressRepo;
import com.hasim.springdata_i.service.AddressService;
import com.hasim.springdata_i.service.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class AddressServiceImpl implements AddressService {
    private final AddressRepo AddressRepo;

    @Override
    public void save(Address p) {
        AddressRepo.save(p);
    }

    @Override
    public void delete(int id) {
        AddressRepo.deleteById(id);
    }

    @Override
    public AddressDto getById(int id) {
        AddressDto result = new AddressDto();
        var item = AddressRepo.findById(id).get();
        result.setCity(item.getCity());
        result.setId(item.getId());
        result.setZip(item.getZip());
        result.setStreet(item.getStreet());

        return result;
    }

    @Override
    public List<AddressDto> getAll() {
        var result= new ArrayList<AddressDto>();
        AddressRepo.findAll().forEach(item -> {
            AddressDto p = new AddressDto();
            p.setId(item.getId());
            p.setCity(item.getCity());
            p.setZip(item.getZip());
            p.setStreet(item.getStreet());
            result.add(p);
        });

        return result;
    }
}
