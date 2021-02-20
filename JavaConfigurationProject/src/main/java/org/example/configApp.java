package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.example")
public class configApp {

    @Bean IFortune fortune()
    {
        return new Fortune();
    }

    @Bean
    public Coach cricketCoach()
    {
        return new CricketCoach(fortune());
    }
    @Bean
    public CricketCoach ccoach(){
        return new CricketCoach(fortune());
    }


}
