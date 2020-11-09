package com.example.demo.repository;

import java.awt.print.Book;

public interface IBookRepository {
    public Long count() ;

    Book create(String author);

    String defindeType();
}
