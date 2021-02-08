package com.DependencyInjection;

public class Cricket implements ICoach{

    private IFortune iFortune;

    public Cricket(IFortune ifortune)
    {
        this.iFortune = ifortune;
    }


    @Override
    public String getDailyWorkout() {
        return "practice 6 hrs daily";
    }

    @Override
    public String getFortune() {
        return iFortune.getFortune();
    }
}
