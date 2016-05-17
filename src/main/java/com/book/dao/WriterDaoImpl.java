package com.book.dao;

import com.book.entity.Writer;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by rafael on 2015-05-06.
 */
@Repository
public class WriterDaoImpl implements WriterDao {

    private static final Logger logger = LoggerFactory.getLogger(WriterDaoImpl.class);

    @Autowired
    SessionFactory sessionFactory;

    public List<Writer> getAll() {
        logger.info("Getting lists writers");
        return sessionFactory.getCurrentSession().createCriteria(Writer.class).list();
    }

    public Writer getById(Integer id) {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("select a from " + Writer.class.getCanonicalName() + " a " +
                " where a.id = :id");
        query.setInteger("id", id);
        return (Writer) query.uniqueResult();
//        Writer writer = (Writer) sessionFactory.getCurrentSession().load(Writer.class, id);
//        logger.info("Writer loaded successfully, `" + writer);
//        return writer;
    }

    public void saveOrUpdate(Writer writer) {
        sessionFactory.getCurrentSession().saveOrUpdate(writer);
    }

    public void remove(Writer writer) {
        sessionFactory.getCurrentSession().delete(writer);
        logger.info("Writer delete");
    }

    public void removeById(Integer id) {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createSQLQuery("delete from writer where id = :id");
        query.setParameter("id", id);
        query.executeUpdate();
        logger.info("Writer removed successfully, Writer details: " + id);
    }

    public void save(Writer writer) {
        sessionFactory.getCurrentSession().save(writer);
        logger.info("Writer save " + writer.getSurname());
    }

    public void update(Writer writer) {
        sessionFactory.getCurrentSession().update(writer);
        logger.info("Writer updated successfully, Writer details:  " + writer);
    }
}
