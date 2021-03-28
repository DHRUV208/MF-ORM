package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("configApp.class");
//get the bean
        Coach coach1 = context.getBean("cricketCoach", CricketCoach.class);
        System.out.println(coach1.getRoutine());

        CricketCoach coach = context.getBean("coach1", CricketCoach.class);
        System.out.println(coach.display());

    }
}
