package com.example.demo;

import com.example.demo.config.ApplicationConfig;
import com.example.demo.repository.BookRepository;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


class SpringPattenTest {

    @Test
    void should_get_bean() {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        BookRepository bean = context.getBean(BookRepository.class);
        System.out.println(bean);
    }

}
