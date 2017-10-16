package ua.deep5.movies.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.deep5.movies.dao.ImageDAO;
import ua.deep5.movies.model.Image;

@Service
public class ImageServiceImpl implements ImageService{
    @Autowired
    private ImageDAO imageDAO;

    @Transactional
    public byte[] get(long id) {
        return imageDAO.get(id);
    }

    @Transactional
    public void add(Image image) {
        imageDAO.add(image);
    }
}
