package ua.deep5.movies.dao;

import ua.deep5.movies.model.Image;

public interface ImageDAO {
    byte[] get(long id);
    void add(Image image);
}
