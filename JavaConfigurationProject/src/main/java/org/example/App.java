package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("configApp.class");
//get the bean
        Coach ccoach = context.getBean("cricketCoach",Coach.class);
        System.out.println(ccoach.getRoutine());

        CricketCoach coach = context.getBean("ccoach",CricketCoach.class);
        System.out.println(coach.display());

    }
}
