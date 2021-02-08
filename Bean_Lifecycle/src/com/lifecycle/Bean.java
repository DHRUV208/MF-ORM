package com.lifecycle;

public class Bean  implements ICoach{
    private IFortune ifortune;

    public Bean() {
        System.out.println("In Constructor");
    }

    @Override
    public String getDailyWorkout() {
        return "Practice Daily";
    }

    @Override
    public String getDailyFortune() {
        return ifortune.getFortune();
    }

    public void setIFortune(IFortune ifortune)
    {
        System.out.println("Calling IFortune Setter");
        this.ifortune = ifortune;
    }

    public void beanInit()
    {
        System.out.println("Initializing Bean Init");
    }
    public void beanDelete()
    {
        System.out.println("Deleting Bean");
    }


}
