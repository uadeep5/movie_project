package ua.deep5.movies.dao;

import org.springframework.stereotype.Repository;
import ua.deep5.movies.model.Producer;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class ProducerDAOImpl implements ProducerDAO{
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void add(Producer producer) {
        entityManager.merge(producer);
    }

    @Override
    public Producer get(long id) {
        Query query = entityManager.createQuery("from Producer p where p.id = :id", Producer.class);
        query.setParameter("id", id);
        return (Producer)query.getSingleResult();
    }

    @Override
    public List<Producer> getAll() {
        Query query = entityManager.createQuery("from Producer p", Producer.class);
        return query.getResultList();
    }
}
