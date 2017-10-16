package ua.deep5.movies.dao;

import ua.deep5.movies.model.Producer;

import java.util.List;

public interface ProducerDAO {
    void add(Producer producer);
    Producer get(long id);
    List<Producer> getAll();
}
