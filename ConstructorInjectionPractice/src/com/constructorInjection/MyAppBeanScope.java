package com.constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyAppBeanScope {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("BeanScopeSpring.xml");

        ICoach iCoach1 = (ICoach)context.getBean("BCoach");
        iCoach1.setName("Deepanshu");
        ICoach iCoach2 = (ICoach)context.getBean("BCoach");
        iCoach2.setName("Bhavuk");
        System.out.println(iCoach1.getName());
        System.out.println(iCoach2.getName());


    }
}
