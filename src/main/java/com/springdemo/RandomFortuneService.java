package com.springdemo;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {


    private List<String> randomFortune = Arrays.asList("BEST", "GOOD", "BETTER");

    @Override
    public String getFortune() {
        return randomFortune.get(new Random().nextInt(randomFortune.size()));
    }
}
