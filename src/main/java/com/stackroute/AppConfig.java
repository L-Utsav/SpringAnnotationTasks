package com.stackroute;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class AppConfig {

    @Bean
    public Actor getactor()
    {
        Actor actor = new Actor();
        actor.setName("Amitabh Bachchan");
        actor.setGender("Male");
        actor.setAge(75);
        return actor;

    }


    @Bean
    public  movie getmovie()
    {
        movie movie = new movie();
        return movie;
    }
}