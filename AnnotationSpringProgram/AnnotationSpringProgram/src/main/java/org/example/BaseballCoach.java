package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("Bcoach")
public class BaseballCoach implements Coach {
    @Autowired
    private IFortune ifortune;


    public BaseballCoach() {
        System.out.println("Baseball Coach:Autowired");
    }

    @Override
    public void getDailyWorkout() {
        System.out.println("Practice Daily 20 hrs");
    }

    @Override
    public String getFortune() {
        return ifortune.getFortune();
    }
}
