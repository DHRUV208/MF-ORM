package org.example;

import org.apache.log4j.BasicConfigurator;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);
        X x = context.getBean("X",X.class);
        x.logic();

        context.close();
    }
}
