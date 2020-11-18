package com.example.demo.domain.bo.adapter;

import com.example.demo.domain.MyInputBo;
import com.example.demo.domain.to.DemoDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
 * @author ：ls05
 * @date ：Created in 2020/11/12 21:05
 */

@Mapper(componentModel = "spring")
public interface DemoDtoToConvert {
    @Mapping(source = "no", target = "serialNo")
    @Mapping(source = "app_id", target = "appid")
    MyInputBo from(DemoDto order);

}
