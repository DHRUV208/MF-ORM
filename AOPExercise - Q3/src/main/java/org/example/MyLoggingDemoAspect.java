package org.example;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class MyLoggingDemoAspect {



    @Pointcut("execution(* logic())")
    public void loggingDemoAspect(){}

    @Before("loggingDemoAspect()")
    public void beforeLoggingDemoAspect()
    {

        System.out.println("Order 2");
    }

    @After("loggingDemoAspect()")
    public void afterLoggingDemoAspect()
    {

        System.out.println("Order 2");
    }
}
