package com.DependencyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
        ICoach coach = (ICoach)context.getBean("myTCoach");
        ICoach coach2 = (ICoach)context.getBean("myBCoach");
        System.out.println(coach2.getDailyWorkout());
        System.out.println(coach2.getFortune());
        System.out.println(coach.getFortune());
    }
}
