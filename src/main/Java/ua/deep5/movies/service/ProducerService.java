package ua.deep5.movies.service;

import ua.deep5.movies.model.Producer;

import java.util.List;

public interface ProducerService {
    void add(Producer producer);
    Producer get(long id);
    List<Producer> getAll();
}
