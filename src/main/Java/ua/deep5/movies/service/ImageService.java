package ua.deep5.movies.service;

import ua.deep5.movies.model.Image;

public interface ImageService {
    byte[] get(long id);
    void add(Image image);
}
