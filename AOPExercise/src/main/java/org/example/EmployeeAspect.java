package org.example;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EmployeeAspect {

    @Before("execution(* getName())")
    public void beforeGetName(){
        System.out.println("Executing Before getName");
    }

    @After("execution(* setName())")
    public void afterSetName(){
        System.out.println("Execution after SetName");
    }

    @Around("execution(* calculate_sal())")
    public Object aroundSal(ProceedingJoinPoint pjp){
        try {
            pjp.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("Before Calculate Salary");
    return pjp;
    }

}
