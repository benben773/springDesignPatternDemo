package com.example.demo.domain.po;

import com.example.demo.domain.Vendor;
import org.springframework.stereotype.Service;

@Service
public interface DateBaseMapper {
    Vendor getOne(String vendor1);
}
