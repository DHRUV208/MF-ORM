package com.DependencyInjection;

public class Baseball implements ICoach{

    private IFortune iFortune;

    public Baseball(IFortune ifortune)
    {
        this.iFortune = ifortune;
    }


    @Override
    public String getDailyWorkout() {
        return "practice 30 hrs daily";
    }

    @Override
    public String getFortune() {
        return iFortune.getFortune();
    }
}
