package ua.deep5.movies.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ua.deep5.movies.model.Image;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Repository
public class ImageDAOImpl implements ImageDAO{
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public byte[] get(long id) {
        Query query = entityManager.createQuery("from Image i where i.id = :id", Image.class);
        query.setParameter("id", id);
        Image image = (Image) query.getSingleResult();
        return image.getImg();
    }

    @Transactional
    public void add(Image image) {
        entityManager.persist(image);
    }
}
