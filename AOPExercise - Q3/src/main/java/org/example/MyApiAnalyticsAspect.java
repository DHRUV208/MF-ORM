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
@Order(3)
public class MyApiAnalyticsAspect {



    @Pointcut("execution(* logic())")
    public void apiAnalyticsAspect(){}

    @Before("apiAnalyticsAspect()")
    public void beforeApiAnalyticsAspect()
    {

        System.out.println("Order 3");
    }

    @After("apiAnalyticsAspect()")
    public void afterApiAnalyticsAspect()
    {

        System.out.println("Order 3");
    }
}
