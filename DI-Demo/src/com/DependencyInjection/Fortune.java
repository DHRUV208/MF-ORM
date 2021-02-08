package com.DependencyInjection;

public class Fortune implements IFortune{
    @Override
    public String getFortune() {
        return "you have a good fortune today";
    }
}
