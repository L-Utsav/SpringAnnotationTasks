package com.stackroute;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class movie {

    Actor actor;
    @Autowired
    public movie(com.stackroute.Actor actor) {
        this.actor = actor;
    }

    public movie() {

    }

    public com.stackroute.Actor getActor() {
        return actor;
    }

    public void setActor(com.stackroute.Actor actor) {
        this.actor = actor;
    }
}