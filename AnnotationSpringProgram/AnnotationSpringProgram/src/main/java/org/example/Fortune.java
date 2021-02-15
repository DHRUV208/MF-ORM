package org.example;

import org.springframework.stereotype.Component;

@Component
public class Fortune implements IFortune {
    @Override
    public String getFortune() {
        return "You have good fortune today!";
    }
}
