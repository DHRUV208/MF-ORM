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
        Coach cricket= context.getBean("Ccoach",Coach.class);

        cricket.getDailyWorkout();
        System.out.println(cricket.getFortune());
        Coach tennis= context.getBean("Tcoach",Coach.class);

        tennis.getDailyWorkout();
        System.out.println(tennis.getFortune());
    }
}
