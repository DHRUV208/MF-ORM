package org.example;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class MyCloudLogAspect {



    @Pointcut("execution(* logic())")
    public void cloudLogAspect(){}

    @Before("cloudLogAspect()")
    public void beforeCloudLogAspect()
    {

        System.out.println("Order 1");
    }

    @After("cloudLogAspect()")
    public void afterCloudLogAspect()
    {

        System.out.println("Order 1");
    }
}
