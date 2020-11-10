package com.example.demo;

import com.example.demo.repository.SeedingMachine;
import com.example.demo.repository.WeatherData;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringPattenTest {

    @Autowired
    SeedingMachine seedingMachine;
    @Autowired
    WeatherData weatherData;
    @Test
    void should_get_seedingMachine_started_when_temp_Over_5() {
        boolean isOpen = seedingMachine.getStatus();
        assertEquals(false,isOpen);
        weatherData.measurementsChanged(6,0,0);
        isOpen = seedingMachine.getStatus();
        assertEquals(true,isOpen);
    }
}
