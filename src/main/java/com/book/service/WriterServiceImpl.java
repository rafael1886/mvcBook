package com.book.service;

import com.book.dao.WriterDao;
import com.book.entity.Writer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by rafael on 2015-05-06.
 */
@Service
public class WriterServiceImpl implements WriterService {

    @Autowired
    WriterDao writerDao;

    @Transactional
    public List<Writer> getAllWriter() {
        return writerDao.getAll();
    }

    @Transactional
    public Writer getWriterById(Integer id) {
        return writerDao.getById(id);
    }

    @Transactional
    public void saveOrUpdateWriter(Writer writer) {
        writerDao.saveOrUpdate(writer);
    }

    @Transactional
    public void removeWriter(Writer writer) {
        writerDao.remove(writer);
    }

    @Transactional
    public void removeWriterById(Integer id) {
        writerDao.removeById(id);
    }

    @Transactional
    public void saveWriter(Writer writer) {
        writerDao.save(writer);
    }

    @Transactional
    public void updateWriter(Writer writer) {
        writerDao.update(writer);
    }
}
