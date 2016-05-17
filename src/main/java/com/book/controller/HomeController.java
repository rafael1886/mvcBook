package com.book.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by rafael on 14.05.16.
 */
@Controller
public class HomeController {

    @RequestMapping(value = {"/", "/home"})
    public ModelAndView home() {
        return new ModelAndView("home");
    }

}
