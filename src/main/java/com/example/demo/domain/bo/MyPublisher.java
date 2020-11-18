package com.example.demo.domain.bo;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author ：ls05
 * @date ：Created in 2020/11/10 7:52
 */
@Component
public class MyPublisher implements ApplicationContextAware{
    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
    public void publisherEvent(WeatherData myEvent) {
        System.out.println("---开始发布 myEvent 事件---");
        applicationContext.publishEvent(myEvent);
    }
}
