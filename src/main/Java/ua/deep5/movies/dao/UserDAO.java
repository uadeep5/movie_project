package ua.deep5.movies.dao;

import org.springframework.stereotype.Repository;
import ua.deep5.movies.model.DBUser;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Repository
public class UserDAO {
    @PersistenceContext
    private EntityManager em;

    public DBUser getUserByLogin(String login){
        Query query = em.createQuery("SELECT u FROM DBUser u WHERE u.login = :login", DBUser.class);
        query.setParameter("login", login);
        return (DBUser) query.getSingleResult();
    }

    public void addUser(DBUser user){
        em.persist(user);
    }

    public boolean existsByLogin(String login){
        return true;
    }

}
