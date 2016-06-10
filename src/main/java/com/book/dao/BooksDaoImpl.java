package com.book.dao;

import com.book.entity.Books;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by rafael on 17.05.16.
 */
@Repository
public class BooksDaoImpl implements BooksDao {

    private static final Logger logger = LoggerFactory.getLogger(BooksDaoImpl.class);

    @Autowired
    SessionFactory sessionFactory;

    public List getAll() {
        logger.info("Getting lists books");
        return sessionFactory.getCurrentSession().createCriteria(Books.class).list();
    }

    public Books getById(Integer id) {
//        return (Books) sessionFactory.getCurrentSession().load(Books.class, id);
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("select book from " + Books.class.getCanonicalName() + " book " +
                " where book.id = :id ");
        query.setInteger("id", id);
        return (Books) query.uniqueResult();
    }

    public void saveOrUpdate(Books books) {
        sessionFactory.getCurrentSession().saveOrUpdate(books);
    }

    public void remove(Books books) {
        sessionFactory.getCurrentSession().delete(books);
    }

    public void removeById(Integer id) {
        sessionFactory.getCurrentSession().createSQLQuery("delete from books where id = :id ")
                .setInteger("id", id)
                .executeUpdate();
    }

    public void save(Books books) {
        sessionFactory.getCurrentSession().save(books);
    }

    public void update(Books books) {
        sessionFactory.getCurrentSession().update(books);
    }
}
