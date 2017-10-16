package ua.deep5.movies.service;

import ua.deep5.movies.model.Actor;
import ua.deep5.movies.model.Movie;
import ua.deep5.movies.model.Producer;

import java.util.List;
import java.util.Set;

public interface MovieService {
    void addMovie(Movie movie);
    List<Movie> getAll();
    Movie get(long id);
}
