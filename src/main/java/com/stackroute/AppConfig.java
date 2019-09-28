package com.stackroute;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class AppConfig {

    @Bean
    public Actor getactor1()
    {
        Actor actor1 = new Actor("Amitabh Bachan","Male", 75);

        return actor1;

    }

    @Bean
    public Actor getactor2()
    {
        Actor actor2 = new Actor("Akshay Kumar","Male", 50);

        return actor2 ;

    }
    @Bean
    public Actor getactor3()
    {
        Actor actor3 = new Actor("Tom Cruise","Male", 54);

        return actor3 ;
    }
    @Bean(value = "movie1")
    public movie getmovie1()
    {
        movie movie1 = new movie(getactor1());
        return movie1;
    }

    @Bean(value = "movie2")
    public movie getmovie2()
    {
        movie movie2 = new movie(getactor2());
        return movie2;
    }
}