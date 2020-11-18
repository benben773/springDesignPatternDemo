package com.example.demo.domain.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;
import org.springframework.stereotype.Component;

/**
 * @author ：ls05
 * @date ：Created in 2020/11/10 12:46
 */
@Component
public class WeatherData extends ApplicationEvent {
    private int temp =0;
    private int humidity=0;
    private int windPower=0;

    public WeatherData(ApplicationContext source) {
        super(source);
    }

    @Autowired
    MyPublisher myPublisher;
    public void measurementsChanged(int temp, int humidity, int windPower) {
        this.temp = temp;
        this.humidity = humidity;
        this.windPower = windPower;
        myPublisher.publisherEvent(this);
    }
    public int getTemp() {
        return temp;
    }
}