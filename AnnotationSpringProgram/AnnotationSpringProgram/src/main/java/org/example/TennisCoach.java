package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("Tcoach")
public class TennisCoach implements Coach {

    private IFortune ifortune;


    public TennisCoach() {
        System.out.println("Tennis Coach Constructor");
    }

    @Autowired
    public void setFortune(IFortune ifortune)
    {
        System.out.println("Calling Tennis Coach: Autowired");
        this.ifortune = ifortune;
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
