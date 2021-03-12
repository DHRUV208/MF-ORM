package org.example;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PerformanceAspect {
    Logger logger = Logger.getLogger(PerformanceAspect.class);
    Long start,end;

    @Pointcut("execution(* logic())")
    public void performance(){}

    @Before("performance()")
    public void start(JoinPoint j){
        System.out.println("Method Name: "+j.getStaticPart().getSignature().getName());
        start=System.currentTimeMillis();
        logger.debug("start time: "+start);
        System.out.println("Executing Before Logic");
    }

    @After("performance()")
    public void afterSetName(JoinPoint j){

        logger.debug("Going to endtime "+j.getSignature());
        end=System.currentTimeMillis();
        System.out.println("Total Time Taken "+(end-start)+"ms");
        System.out.println("Execution after Logic");
    }

    @AfterReturning(pointcut = "performance()" ,returning = "result")
    public void returnResult(String result) {
        System.out.println("After Return Result is "+result);
    }

}
