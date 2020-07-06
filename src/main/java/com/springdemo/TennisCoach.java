package com.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

// when spring scans this package they will find this class and they will automatically register this bean with the spring container
//@Component("thatSillyCoach")

//Default id is the name of the class
@Component
//@Scope("prototype")
public class TennisCoach implements Coach {

    @Autowired
    @Qualifier("databaseFortuneService")
    private FortuneService fortuneService;

    public TennisCoach() {
        System.out.println("TEennisCoach Constructor");
    }

//    @Autowired
//    public void setFortuneService(FortuneService fortuneService){
//        System.out.println("TENNISCoach inside SETTER");
//        this.fortuneService = fortuneService;
//    }

//    @Autowired
//    public void doSomeCrazyStuff(FortuneService fortuneService) {
//        System.out.println("TENNISCoach inside METHOD");
//
//        this.fortuneService = fortuneService;
//    }

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    @PostConstruct
    public void doMyStartupStuff(){
        System.out.println("Starting ------->>>>>> doMyStartupStuff");
    }

    @PreDestroy
    public void doMyCleanupStuff(){
        System.out.println("Finishing destroying------->>>>>> doMyStartupStuff");
    }
}