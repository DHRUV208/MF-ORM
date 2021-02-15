package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("Ccoach")
public class CricketCoach implements Coach {

    private IFortune ifortune;

    @Autowired
    public CricketCoach(IFortune ifortune) {
        System.out.println("Cricket Coach : Autowired");
        this.ifortune = ifortune;
    }

    @Override
    public void getDailyWorkout() {
        System.out.println("Practice Daily 15 hrs");
    }

    @Override
    public String getFortune() {
        return ifortune.getFortune();
    }
}
