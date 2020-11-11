package com.gchsj.index.controller;

import com.gchsj.index.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

    @Autowired
    private IndexService indexService;

    @GetMapping(value = "/")
    public String root() {
        indexService.logs();
        return "forward:/index";
    }

    @GetMapping(value = "/index")
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("data", "This is model from index controller.");
        modelAndView.setViewName("index");
        return modelAndView;
    }

}
