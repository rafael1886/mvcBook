package com.book.dao;

import com.book.entity.Books;

import java.util.List;

/**
 * Created by rafael on 17.05.16.
 */
public interface BooksDao {

    List getAllBooks();

    Books getById(Integer id);

    void saveOrUpdateBook(Books books);

    void removeBook(Books books);

    void removeByIdBook(Integer id);

    void saveBook(Books books);

    void updateBook(Books books);
}
