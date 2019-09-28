package com.stackroute;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Actor getactor1()
    {
        Actor actor1 = new Actor("Arnold ","Male",73);
        return actor1;
    }
    @Bean
    public Actor getactor2()
    {
        Actor actor2 = new Actor("Akshay","Male",50);
        return actor2;
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