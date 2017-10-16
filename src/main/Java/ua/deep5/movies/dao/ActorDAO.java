package ua.deep5.movies.dao;

import ua.deep5.movies.model.Actor;

import java.util.List;

public interface ActorDAO {
    void add(Actor actor);
    Actor get(long id);
    List<Actor> getAll();
}
