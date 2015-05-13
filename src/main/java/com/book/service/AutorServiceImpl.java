package com.book.service;

import com.book.dao.AutorDao;
import com.book.entity.Autor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by rafael on 2015-05-06.
 */
@Service
public class AutorServiceImpl implements AutorService {

    @Autowired
    AutorDao autorDao;

    @Transactional
    public List<Autor> getAllAutor() {
        return autorDao.getAll();
    }

    @Transactional
    public Autor getAutorById(Integer id) {
        return autorDao.getById(id);
    }

    @Transactional
    public void saveOrUpdateAutor(Autor autor) {
        autorDao.saveOrUpdate(autor);
    }

    @Transactional
    public void removeAutor(Autor autor) {
        autorDao.remove(autor);
    }

    @Transactional
    public void removeAutorById(Integer id) {
        autorDao.removeById(id);
    }

    @Transactional
    public void saveAutor(Autor autor) {
        autorDao.save(autor);
    }

    @Transactional
    public void updateAutor(Autor autor) {
        autorDao.update(autor);
    }
}
