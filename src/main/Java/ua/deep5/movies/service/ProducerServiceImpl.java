package ua.deep5.movies.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.deep5.movies.dao.ProducerDAO;
import ua.deep5.movies.model.Producer;

import java.util.List;

@Service
public class ProducerServiceImpl implements ProducerService {
    @Autowired
    private ProducerDAO producerDAO;

    @Transactional
    public void add(Producer producer) {
        producerDAO.add(producer);
    }

    @Transactional
    public Producer get(long id) {
        return producerDAO.get(id);
    }

    @Transactional
    public List<Producer> getAll() {
        return producerDAO.getAll();
    }
}
