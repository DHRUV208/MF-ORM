package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


@Scope("singleton")
@Component("Bcoach")
public class BaseballCoach implements Coach{

    @PostConstruct
    public void startup()
    {
        System.out.println("Post Construct Method Called");
    }

    @PreDestroy
    public void end()
    {
        System.out.println("Pre Destroy Method");
    }


    @Autowired
    @Qualifier("fortuneCoach")
    private IFortune ifortune;

    @Override
    public void getDailySchedule() {
        System.out.println("Practice Daily 7 hours");
    }

    @Override
    public void getCoachFortune() {
        ifortune.getCoachFortune();
    }
}
