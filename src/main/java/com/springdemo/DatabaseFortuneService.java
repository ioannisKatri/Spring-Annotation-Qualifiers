package com.springdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DatabaseFortuneService implements FortuneService {

    @Value("${fortune.array}")
    private String[] fortuneArray;

    @Override

    public String getFortune() {
        return fortuneArray[0];
    }
}
