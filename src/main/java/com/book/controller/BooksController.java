package com.book.controller;

import com.book.entity.Books;
import com.book.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.logging.Logger;

/**
 * Created by rafael on 30.05.16.
 */
@Controller
public class BooksController {
    Logger log = Logger.getLogger(BooksController.class.toString());

    @Autowired
    BooksService booksService;

    @RequestMapping(value = {"/getAllBooks"})
    public ModelAndView getAllBooks() {
        List<Books> booksList = booksService.getAllBooks();
        return new ModelAndView("booksList", "booksList", booksList);
    }

    @RequestMapping(value = "createBooks")
    public ModelAndView createBooks(@ModelAttribute Books books) {
        log.info("create books");
        return new ModelAndView("booksForm");
    }

    @RequestMapping(value = "/editBooks{id}")
    private ModelAndView editBooks(@RequestParam int id, @ModelAttribute Books books) {
        log.info("edit books");
        books = booksService.getBooksById(id);
        return new ModelAndView("booksForm", "booksObjects", books);
    }

    @RequestMapping("/saveBooks")
    public ModelAndView saveBooks(@ModelAttribute Books books) {
        log.info("save books");
        if (books.getId() == null || books.getId() == 0) {
            booksService.saveBooks(books);
        } else {
            booksService.updateBooks(books);
        }
        return new ModelAndView("redirect:getAllBooks");
    }

    @RequestMapping("/cancelBooks")
    public ModelAndView cancelBooks() {
        return new ModelAndView("redirect:getAllBooks");
    }

    @RequestMapping("/deleteBooks")
    public ModelAndView deleteBooks(@RequestParam int id) {
        log.info("delete books");
        booksService.removeBooksById(id);
        return new ModelAndView("redirect:getAllBooks");
    }
}
