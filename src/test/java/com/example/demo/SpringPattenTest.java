package com.example.demo;

import com.example.demo.config.ApplicationConfig;
import com.example.demo.repository.BookRepository;
import com.example.demo.repository.SeedingMachine;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringPattenTest {

//    @Test
//    void should_get_bean() {
//        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
//        BookRepository bean = context.getBean(BookRepository.class);
//        System.out.println(bean);
//    }
    @Autowired
SeedingMachine seedingMachine;
    @Test
    void should_get_seedingMachine_started_when_temp_Over_5() {
        boolean isOpen = seedingMachine.getStatus();
        assertEquals(false,isOpen);
    }
}
