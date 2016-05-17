package com.book.dao;

import com.book.entity.Books;

import java.util.List;

/**
 * Created by rafael on 17.05.16.
 */
public interface BooksDao {

    List getAll();

    Books getById(Integer id);

    void saveOrUpdate(Books books);

    void remove(Books books);

    void removeById(Integer id);

    void save(Books books);

    void update(Books books);
}
