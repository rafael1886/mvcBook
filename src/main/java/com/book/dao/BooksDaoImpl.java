package com.book.dao;

import com.book.entity.Books;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by rafael on 17.05.16.
 */
@Repository
public class BooksDaoImpl extends AbstractDao<Integer, Books> implements BooksDao {

    private static final Logger logger = LoggerFactory.getLogger(BooksDaoImpl.class);

    public List getAllBooks() {
        logger.info("Getting lists books");
        return getSession().createCriteria(Books.class)
                .list();
    }

    public Books getById(Integer id) {
        return (Books) getSession().load(Books.class, id);
    }

    public void saveOrUpdateBook(Books books) {
        getSession().saveOrUpdate(books);
    }

    public void removeBook(Books books) {
        getSession().delete(books);
    }

    public void removeByIdBook(Integer id) {
        getSession().createSQLQuery("delete from books where id = :id")
                .setParameter("id", id)
                .executeUpdate();
    }

    public void saveBook(Books books) {
        getSession().save(books);
    }

    public void updateBook(Books books) {
        getSession().update(books);
    }
}
