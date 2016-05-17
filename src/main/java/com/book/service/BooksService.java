package com.book.service;

import com.book.entity.Books;

import java.util.List;

/**
 * Created by rafael on 17.05.16.
 */
public interface BooksService {
    List<Books> getAllBooks();

    Books getBooksById(Integer id);

    void saveOrUpdateBooks(Books books);

    void removeBooks(Books books);

    void removeBooksById(Integer id);

    void saveBooks(Books books);

    void updateBooks(Books books);
}
