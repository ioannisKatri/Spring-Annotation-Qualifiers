package com.springdemo;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Component
public class RESTFortuneService implements FortuneService {

    private List<String> randomFortune = Arrays.asList("BEST", "GOOD", "BETTER");

    @Override
    public String getFortune() {

        System.out.println("here => " + randomFortune.get(new Random().nextInt(randomFortune.size())));
        return randomFortune.get(new Random().nextInt(randomFortune.size()));


    }
}
