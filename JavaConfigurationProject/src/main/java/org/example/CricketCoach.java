package org.example;

public class CricketCoach implements Coach {

    private IFortune fortune;

    public CricketCoach(IFortune fortune) {
        this.fortune = fortune;
    }

    @Override
    public String getRoutine() {
        return "do daily workout";
    }

    @Override
    public String getFortune() {
        return fortune.getFortune();
    }

    public String display() {
        return fortune.getFortune();
    }
}
