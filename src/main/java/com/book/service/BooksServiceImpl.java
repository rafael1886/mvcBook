package com.book.service;

import com.book.dao.BooksDao;
import com.book.entity.Books;
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

    @Autowired
    BooksDao booksDao;

    public List<Books> getAllBooks() {
        return booksDao.getAll();
    }

    public Books getBooksById(Integer id) {
        return booksDao.getById(id);
    }

    public void saveOrUpdateBooks(Books books) {
        booksDao.saveOrUpdate(books);
    }

    public void removeBooks(Books books) {
        booksDao.remove(books);
    }

    public void removeBooksById(Integer id) {
        booksDao.removeById(id);
    }

    public void saveBooks(Books books) {
        booksDao.save(books);
    }

    public void updateBooks(Books books) {
        booksDao.update(books);
    }
}
