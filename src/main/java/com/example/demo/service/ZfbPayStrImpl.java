package com.example.demo.service;

import org.springframework.stereotype.Component;

/**
 * @author ：ls05
 * @date ：Created in 2020/11/9 23:37
 */
@Component
public class ZfbPayStrImpl implements IPayStr {
    @Override
    public String pay() {
        return PayType.ZFB.getDesc();
    }

    @Override
    public PayType defindeType() {
        return PayType.ZFB;
    }
}
