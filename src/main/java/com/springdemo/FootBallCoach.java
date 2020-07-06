package com.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class FootBallCoach implements Coach {

    private FortuneService fortuneService;

//Spring will scan for a compomnent that implements fortunate interface
//    Soring will create an instance and then inject it

//    Injecting the happyfortune implementation
//    @Autowired
//    public FootBallCoach(FortuneService fortuneService) {
//        this.fortuneService = fortuneService;
//    }

    @Autowired
    public FootBallCoach(@Qualifier("happyFortuneService") FortuneService fortuneService) {
        System.out.println("creating football constructor");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "better take that ball and start kicking it";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
