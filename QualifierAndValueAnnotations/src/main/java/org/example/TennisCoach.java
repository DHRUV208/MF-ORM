package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("Tcoach")
public class TennisCoach implements Coach{

    @Autowired
    @Qualifier("fortuneCoach")
    private IFortune ifortune;

    @Override
    public void getDailySchedule() {
        System.out.println("Practice Daily 9 hours");
    }

    @Override
    public void getCoachFortune() {
        ifortune.getCoachFortune();
    }
}
