package com.example.demo.domain.bo.adapter;

import com.example.demo.domain.MyInputBo;
import com.example.demo.domain.to.DemoDto;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.mapstruct.factory.Mappers;

import static org.junit.Assert.assertEquals;

public class GivenClientInputSerialNo {
    DemoDto demoDto = new DemoDto();
    @Before
    public void setUp() throws Exception {
        demoDto.setNo("serialNO");
        demoDto.setApp_id("120123");
        demoDto.setId3("id3");
    }
    @Test
    public void should_adapt_to_my_bo() {
        DemoDtoToConvert mapper = Mappers.getMapper(DemoDtoToConvert.class);
        MyInputBo bo = mapper.from(demoDto);
        assertEquals(bo.getSerialNo(), demoDto.getNo());
    }
}