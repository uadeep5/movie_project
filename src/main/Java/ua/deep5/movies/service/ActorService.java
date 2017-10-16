package ua.deep5.movies.service;

import ua.deep5.movies.model.Actor;

import java.util.List;

public interface ActorService {
    void addActor(Actor actor);
    Actor get(long id);
    List<Actor> getAll();
}

