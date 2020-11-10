package com.example.demo.repository;

import org.springframework.stereotype.Component;

/**
 * @author ：ls05
 * @date ：Created in 2020/11/10 7:52
 */
@Component
public class SeedingMachine {
    private boolean isOpen;
    public boolean getStatus() {
        return isOpen;
    }
}
