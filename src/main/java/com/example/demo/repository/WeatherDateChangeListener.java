package com.example.demo.repository;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author ：ls05
 * @date ：Created in 2020/11/10 7:52
 */
@Component
public class WeatherDateChangeListener implements ApplicationListener<WeatherData> {
    private boolean isOpen;
    public boolean getStatus() {
        return isOpen;
    }

    public void start() {
        isOpen = true;
    }

    @Override
    public void onApplicationEvent(WeatherData weatherData) {
        if (weatherData.getTemp() > 5) {
            this.start();
        }
    }
}
