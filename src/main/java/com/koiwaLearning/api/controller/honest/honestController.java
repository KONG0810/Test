package com.koiwaLearning.api.controller.honest;

import com.koiwaLearning.api.domain.honest.HonestDomain;
import com.koiwaLearning.api.service.honest.HonestService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/honest")
public class honestController {

    @Autowired
    private HonestService honestService;

    /**
     * インデックス
     */
    @RequestMapping(value = { "/", "/index" }, method = RequestMethod.GET)
    public ModelAndView index(Model model) {

        System.out.println("welcome to honest");

        HonestDomain honestDomain = new HonestDomain("id", "pw", null);
        honestService.loginTimestamp(honestDomain);
        // model.addAttribute("honest", "honest");
        // model.addAttribute("title", "honest信息");
        System.out.println("loginTimestamp = " + honestDomain.getUser());

        return new ModelAndView("honest/index", "honestModel", honestDomain);
    }

    /**
     * ログイン
     */
    @RequestMapping(value = { "/login" }, method = RequestMethod.GET)
    public ModelAndView login(@RequestParam("loginId") String loginId, @RequestParam("loginPw") String loginPw) {

        System.out.println("welcome to honest login");
        HonestDomain honestDomain = new HonestDomain(loginId, loginPw, null);

        honestService.loginCheck(honestDomain);

        return new ModelAndView("honest/index", "honestDomain", honestDomain);
    }
}
