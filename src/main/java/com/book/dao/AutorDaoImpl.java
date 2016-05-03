package com.book.dao;

import com.book.entity.Autor;
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
public class AutorDaoImpl implements AutorDao {

    private static final Logger logger = LoggerFactory.getLogger(AutorDaoImpl.class);

    @Autowired
    SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public List<Autor> getAll() {
        logger.info("Getting lists autors");
        return sessionFactory.getCurrentSession().createCriteria(Autor.class).list();
    }

    public Autor getById(Integer id) {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("select a from " + Autor.class.getCanonicalName() + " a " +
                " where a.id = :id");
        query.setInteger("id", id);
        return (Autor) query.uniqueResult();
//        Autor autor = (Autor) sessionFactory.getCurrentSession().load(Autor.class, id);
//        logger.info("Autor loaded successfully, `" + autor);
//        return autor;
    }

    public void saveOrUpdate(Autor autor) {
        sessionFactory.getCurrentSession().saveOrUpdate(autor);

    }

    public void remove(Autor autor) {
        sessionFactory.getCurrentSession().delete(autor);
        logger.info("Autor delete");
    }

    public void removeById(Integer id) {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createSQLQuery("delete from autor where id = :id");
        query.setParameter("id", id);
        query.executeUpdate();
        logger.info("Autor removed successfully, Autro details: " + id);
    }

    public void save(Autor autor) {
        sessionFactory.getCurrentSession().save(autor);
        logger.info("Autor save " + autor.getNazwisko());
    }

    public void update(Autor autor) {
        sessionFactory.getCurrentSession().update(autor);
        logger.info("Autor updated successfully, Autor details:  " + autor);
    }
}
