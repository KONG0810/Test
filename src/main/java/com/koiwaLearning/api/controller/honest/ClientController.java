package com.koiwaLearning.api.controller.honest;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/honest/client")
public class ClientController {

    /**
     * 跳转
     */
    @RequestMapping(value = { "/", "/index" }, method = RequestMethod.GET)
    public ModelAndView index(Model model) {

        System.out.println("welcome to honest clientController");

        // model.addAttribute("honest", "honest");
        // model.addAttribute("title", "honest信息");
        return new ModelAndView("honest/client", "honestModel", model);
    }
}
