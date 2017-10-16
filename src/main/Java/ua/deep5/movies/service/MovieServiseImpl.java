package ua.deep5.movies.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.deep5.movies.dao.MovieDAO;
import ua.deep5.movies.model.Movie;

import java.util.List;

@Service
public class MovieServiseImpl implements MovieService{
    @Autowired
    private MovieDAO movieDAO;

    @Transactional
    public void addMovie(Movie movie) {
        movieDAO.add(movie);
    }

    @Transactional
    public List<Movie> getAll(){
        return movieDAO.getAll();
    }

    @Transactional
    public Movie get(long id) {
        return movieDAO.get(id);
    }
}
