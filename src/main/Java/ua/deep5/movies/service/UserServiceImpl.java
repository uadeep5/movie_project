package ua.deep5.movies.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.deep5.movies.dao.UserDAO;
import ua.deep5.movies.model.DBUser;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDAO userDAO;

    public DBUser getUserByLogin(String login){
       return userDAO.getUserByLogin(login);
    }

    public void addUser(DBUser user){
        userDAO.addUser(user);
    }

    public boolean existsByLogin(String login) {
        return userDAO.existsByLogin(login);
    }
}

