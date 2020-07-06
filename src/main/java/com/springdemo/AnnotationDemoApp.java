package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

//@SpringBootApplication
public class AnnotationDemoApp {

    public static void main(String[] args) {
//        SpringApplication.run(AnnotationDemoApp.class, args);

        ClassPathXmlApplicationContext content = new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach coach = content.getBean("tennisCoach", Coach.class);

        System.out.println(coach.getDailyFortune());

        System.out.println(coach.getDailyWorkout());

        content.close();

//        PROTOTYPE BEANS ARE NOT GETTING DESTROYED -> https://www.udemy.com/spring-hibernate-tutorial/learn/lecture/5389290#questions/6834322

    }

}
