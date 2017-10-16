package ua.deep5.movies.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.deep5.movies.dao.ActorDAO;
import ua.deep5.movies.model.Actor;

import java.util.List;

@Service
public class ActorServiceImpl implements ActorService{
    @Autowired
    private ActorDAO actorDAO;

    @Transactional
    public void addActor(Actor actor) {
        actorDAO.add(actor);
    }

    @Transactional
    public Actor get(long id) {
        return actorDAO.get(id);
    }

    @Transactional
    public List<Actor> getAll() {
        return actorDAO.getAll();
    }
}
