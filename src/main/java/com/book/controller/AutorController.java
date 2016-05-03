package com.book.controller;

import com.book.entity.Autor;
import com.book.service.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by rafael on 2015-05-06.
 */
@Controller
public class AutorController {

    @Autowired
    private AutorService autorService;

    @RequestMapping("/createAutor")
    public ModelAndView createAutor(@ModelAttribute Autor autor) {
        return new ModelAndView("autorForm");
    }

    @RequestMapping("/editAutor/{id}")
    public  ModelAndView editAutor(@RequestParam int id, @ModelAttribute Autor autor) {
        autor = autorService.getAutorById(id);
        return  new ModelAndView("autorForm", "autorObject", autor);
    }

    @RequestMapping("/saveAutor")
    public ModelAndView saveAutor (@ModelAttribute Autor autor) {
        if (autor.getId() == null || autor.getId() == 0) {
            autorService.saveAutor(autor);
        } else {
            autorService.updateAutor(autor);
        }
//        autorService.saveOrUpdateAutor(autor);
        return new ModelAndView("redirect:getAllAutor");
    }

    @RequestMapping("/anulujAutor")
    public ModelAndView anulujAutor () {
        return new ModelAndView("redirect:getAllAutor");
    }

    @RequestMapping("/deleteAutor")
    public ModelAndView deleteAutor (@RequestParam int id) {
        autorService.removeAutorById(id);
        return new ModelAndView("redirect:getAllAutor");
    }

    @RequestMapping(value = {"getAllAutor", "/"})
    public ModelAndView getAllBook() {
        List<Autor> autorList = autorService.getAllAutor();
        return new ModelAndView("autorList", "autorList", autorList);
    }
}
