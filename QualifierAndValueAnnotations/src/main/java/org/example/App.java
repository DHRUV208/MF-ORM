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
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml" );
        Coach coach1 = context.getBean("Bcoach", Coach.class);
        coach1.getCoachFortune();
        coach1.getDailySchedule();
        Coach coach2 = context.getBean("Tcoach",Coach.class);
        coach2.getCoachFortune();
        coach2.getDailySchedule();

    }
}
