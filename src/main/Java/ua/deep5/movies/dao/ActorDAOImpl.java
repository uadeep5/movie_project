package ua.deep5.movies.dao;

import org.springframework.stereotype.Repository;
import ua.deep5.movies.model.Actor;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class ActorDAOImpl implements ActorDAO{
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void add(Actor actor) {
        entityManager.merge(actor);
    }

    @Override
    public Actor get(long id) {
        Query query = entityManager.createQuery("from Actor a where a.id = :id");
        query.setParameter("id", id);
        return (Actor) query.getSingleResult();
    }

    @Override
    public List<Actor> getAll() {
        Query query = entityManager.createQuery("from Actor", Actor.class);
        return query.getResultList();
    }
}
