package com.example.demo.domain.po;

import com.example.demo.domain.Vendor;
import org.springframework.stereotype.Component;

/**
 * @author ：ls05
 * @date ：Created in 2020/11/3 22:41
 */
@Component
public class DateBaseMapperImpl implements DateBaseMapper {
    @Override
    public Vendor getOne(String vendor1) {
        return new Vendor(vendor1);
    }
}
