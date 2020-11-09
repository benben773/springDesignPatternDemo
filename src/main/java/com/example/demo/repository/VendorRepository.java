package com.example.demo.repository;

import com.example.demo.domain.Vendor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @author ：ls05
 * @date ：Created in 2020/11/3 22:26
 */
@Service
public class VendorRepository {
    @Autowired
    private DateBaseMapper dateBaseMapper;

    public Vendor getVendorById(String vendor1) {
        return dateBaseMapper.getOne(vendor1);
    }
}
