package org.example;

import org.aspectj.lang.annotation.Aspect;


import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DemoLodgingAspect {
    @Before("execution(public void addAccount())")
    public void beforeAddAccountAdvice() {

        System.out.println("\n=====>>> Executing @Before advice on addAccount()");

    }
}
