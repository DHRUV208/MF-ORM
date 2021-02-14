package com.ncu.applications;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String [] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        IWorker iworker = (IWorker)context.getBean("swork");

        Consumer consumer = new Consumer(iworker);
        consumer.manageProducer();
    }
}
