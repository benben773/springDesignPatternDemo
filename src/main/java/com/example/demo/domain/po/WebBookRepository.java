package com.example.demo.domain.po;

import org.springframework.stereotype.Component;

import java.awt.print.Book;

/**
 * @author ：ls05
 * @date ：Created in 2020/11/2 7:06
 */
@Component
public class WebBookRepository implements IBookRepository {
    @Override
    public Long count() {
        return 2L;
    }

    @Override
    public Book create(String author) {
        return null;
    }

    @Override
    public String defindeType() {
        return "type2";
    }
}
