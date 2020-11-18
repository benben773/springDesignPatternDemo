package com.example.demo.domain.po;

import java.awt.print.Book;

public interface IBookRepository {
    public Long count() ;

    Book create(String author);

    String defindeType();
}
