package ua.deep5.movies.dao;


import ua.deep5.movies.model.Movie;

import java.util.List;

public interface MovieDAO {
    Movie add(Movie movie);
    List<Movie> getAll();
    Movie get(long id);
}
