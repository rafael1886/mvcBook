package com.book.controller;

import com.book.entity.Writer;
import com.book.service.WriterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.logging.Logger;

/**
 * Created by rafael on 2015-05-06.
 */
@Controller
public class WriterController {
    Logger log = Logger.getLogger(WriterController.class.getName());

    @Autowired
    private WriterService writerService;

    @RequestMapping("/createWriter")
    public ModelAndView createWriter(@ModelAttribute Writer writer) {
        log.info("create writer");
        return new ModelAndView("writerForm");
    }

    @RequestMapping("/editWriter/{id}")
    public ModelAndView editWriter(@RequestParam int id, @ModelAttribute Writer writer) {
        log.info("edit writer");
        writer = writerService.getWriterById(id);
        return new ModelAndView("writerForm", "writerObject", writer);
    }

    @RequestMapping("/saveWriter")
    public ModelAndView saveWriter(@ModelAttribute Writer writer) {
        log.info("save writer");
        if (writer.getId() == null || writer.getId() == 0) {
            writerService.saveWriter(writer);
        } else {
            writerService.updateWriter(writer);
        }
//        writerService.saveOrUpdateWriter(writer);
        return new ModelAndView("redirect:getAllWriter");
    }

    @RequestMapping("/cancelWriter")
    public ModelAndView cancelWriter() {
        return new ModelAndView("redirect:getAllWriter");
    }

    @RequestMapping("/deleteWriter")
    public ModelAndView deleteWriter(@RequestParam int id) {
        log.info("delete writer");
        writerService.removeWriterById(id);
        return new ModelAndView("redirect:getAllWriter");
    }

    @RequestMapping(value = {"getAllWriter", "/writer"})
    public ModelAndView getAllWriters() {
        List<Writer> writerList = writerService.getAllWriter();
        return new ModelAndView("writerList", "writerList", writerList);
    }
}
