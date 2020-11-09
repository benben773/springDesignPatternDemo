package com.example.demo.service;

import org.springframework.stereotype.Component;

/**
 * @author ：ls05
 * @date ：Created in 2020/11/9 23:37
 */

@Component
public class WxPayStrImpl implements IPayStr {
    @Override
    public String pay() {
        return PayType.WX.getDesc();
    }

    @Override
    public PayType defindeType() {
        return PayType.WX;
    }
}
