package com.rootnext.webapp.controllers;

import com.rootnext.webapp.services.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by sanjoy on 7/8/15.
 */
@Controller
public class ApplicationController {
    @Autowired
    TestService testService;

    @RequestMapping("/")
    public String index(Model model){
        testService.testLog();
        model.addAttribute("msg", testService.getMessage());
        return "index";
    }


}
