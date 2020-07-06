package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach theCoash = context.getBean("footBallCoach", Coach.class);

        Coach alphaCoash = context.getBean("footBallCoach", Coach.class);

        boolean result = theCoash == alphaCoash;
        System.out.println(result);
        System.out.println("memory location theCoach -> " + theCoash);
        System.out.println("memory location alphaCoach -> " +alphaCoash);
    }
}
