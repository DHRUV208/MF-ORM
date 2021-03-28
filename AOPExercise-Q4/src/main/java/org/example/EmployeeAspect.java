package org.example;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EmployeeAspect {

    @AfterThrowing(value="execution(* *())",throwing="ex")
    public void afterThrowingAdvice(JoinPoint joinPoint, IDNotFoundException ex){
        System.out.println("ID NOT FOUND");
    }
}
