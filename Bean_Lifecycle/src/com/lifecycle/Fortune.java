package com.lifecycle;

public class Fortune implements IFortune {
    public Fortune() {
        System.out.println("In Fortune Constructor");
    }

    public String getFortune() {
        return "you have a good fortune today";
    }
}
