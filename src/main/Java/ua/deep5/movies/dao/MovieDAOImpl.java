package ua.deep5.movies.dao;
import org.springframework.stereotype.Repository;
import ua.deep5.movies.model.Movie;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class MovieDAOImpl implements MovieDAO{
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Movie add(Movie movie) {
        return entityManager.merge(movie);
    }

    @Override
    public List<Movie> getAll() {
        Query query = entityManager.createQuery("from Movie", Movie.class);
        return query.getResultList();
    }

    @Override
    public Movie get(long id) {
        Query query = entityManager.createQuery("from Movie m where m.id = :id", Movie.class);
        query.setParameter("id", id);
        return (Movie) query.getSingleResult();
    }
}
