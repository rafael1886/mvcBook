package com.book.service;

import com.book.dao.BooksDao;
import com.book.entity.Books;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by rafael on 17.05.16.
 */
@Service
@Transactional
public class BooksServiceImpl implements BooksService {

    private static Logger log = Logger.getLogger(BooksService.class);

    @Autowired
    private BooksDao booksDao;

    public List<Books> getAllBooks() {
        return booksDao.getAllBooks();
    }

    public Books getBooksById(Integer id) {
        return booksDao.getById(id);
    }

    public void saveOrUpdateBooks(Books books) {
        booksDao.saveOrUpdateBook(books);
    }

    public void removeBooks(Books books) {
        booksDao.removeBook(books);
    }


    public void removeBooksById(Integer id) {
        booksDao.removeByIdBook(id);
    }

    public void saveBooks(Books books) {
        booksDao.saveBook(books);
    }

    public void updateBooks(Books books) {
        booksDao.updateBook(books);
    }
}
