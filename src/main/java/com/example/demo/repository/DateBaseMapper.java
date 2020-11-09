package com.example.demo.repository;

import com.example.demo.domain.Vendor;
import org.springframework.stereotype.Service;

@Service
public interface DateBaseMapper {
    Vendor getOne(String vendor1);
}
