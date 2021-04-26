package com.koiwaLearning.api.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping
public class IndexController {

    /**
     * 主页路径
     */
    private static final String INDEX = "/honest/index";
    // private static final String INDEX = "/index";

    /**
     * 跳转
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView index(Model model) {

        return new ModelAndView(INDEX, "indexModel", model);
    }
}
