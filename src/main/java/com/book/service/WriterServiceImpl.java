package com.book.service;

import com.book.dao.WriterDao;
import com.book.entity.Writer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by rafael on 2015-05-06.
 */
@Service
@Transactional
public class WriterServiceImpl implements WriterService {

    @Autowired
    private WriterDao writerDao;
    
    public List<Writer> getAllWriter() {
        return writerDao.getAllWriter();
    }

    public Writer getWriterById(Integer id) {
        return writerDao.getByIdWriter(id);
    }

    public void saveOrUpdateWriter(Writer writer) {
        writerDao.saveOrUpdateWriter(writer);
    }

    public void removeWriter(Writer writer) {
        writerDao.remove(writer);
    }

    public void removeWriterById(Integer id) {
        writerDao.removeById(id);
    }

    public void saveWriter(Writer writer) {
        writerDao.save(writer);
    }

    public void updateWriter(Writer writer) {
        writerDao.update(writer);
    }
}
