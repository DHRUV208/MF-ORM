package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        CricketCoach cricket=(CricketCoach)context.getBean("Ccoach",CricketCoach.class);

        cricket.getDailyWorkout();
        System.out.println(cricket.getFortune());
        TennisCoach tennis=(TennisCoach)context.getBean("Tcoach",TennisCoach.class);

        tennis.getDailyWorkout();
        System.out.println(tennis.getFortune());
    }
}
