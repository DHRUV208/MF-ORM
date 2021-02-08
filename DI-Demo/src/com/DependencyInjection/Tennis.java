package com.DependencyInjection;

public class Tennis implements ICoach{

    private IFortune iFortune;

    public Tennis(IFortune ifortune)
    {
        this.iFortune = ifortune;
    }


    @Override
    public String getDailyWorkout() {
        return "practice 10 hrs daily";
    }

    @Override
    public String getFortune() {
        return iFortune.getFortune();
    }
}
