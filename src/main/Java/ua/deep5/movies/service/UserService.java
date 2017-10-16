package ua.deep5.movies.service;

import ua.deep5.movies.model.DBUser;

public interface UserService {
    DBUser getUserByLogin(String login);
    void addUser(DBUser user);
    boolean existsByLogin(String login);
}
