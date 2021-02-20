package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Random;


@Component("fortuneCoach")
@Scope("singleton")
public class Fortune implements IFortune{
    String dailyFortune;

    @Value("${fortune}")
    public void randomFortune(String[] fortune)
    {
     Random random = new Random();
     int r = random.nextInt(fortune.length-1);
     this.dailyFortune = fortune[r];
    }
    @Override
    public void getCoachFortune() {
        System.out.println(dailyFortune);
    }
}
