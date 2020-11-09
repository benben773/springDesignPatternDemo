package com.example.demo.service;

import com.example.demo.repository.IBookRepository;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author ：ls05
 * @date ：Created in 2020/11/9 23:33
 */
@Service
public class PayContext  {
    private static Map<IPayStr.PayType, IPayStr> payRepositoryMap= new HashMap<>();

    public PayContext(List<IPayStr> payStrList) {
        payStrList.forEach( one ->{
            payRepositoryMap.put(one.defindeType(), one);
        });
    }

    public String pay(String payType) {
        return payRepositoryMap.get(Enum.valueOf(IPayStr.PayType.class,payType) ).pay();
    }
}
