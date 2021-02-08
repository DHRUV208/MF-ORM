package com.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        System.out.println("bean factory called");
        ICoach coach=(ICoach)context.getBean("Beanlife");
        ICoach coach1=(ICoach)context.getBean("Beanlife");
        System.out.println(coach);
        System.out.println(coach1);
        ((ClassPathXmlApplicationContext)context).close();
        coach.getDailyFortune();

    }
}
