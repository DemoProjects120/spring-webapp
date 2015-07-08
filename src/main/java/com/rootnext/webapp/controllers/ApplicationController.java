package com.rootnext.webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by sanjoy on 7/8/15.
 */
@Controller
public class ApplicationController {

    @RequestMapping("/")
    public String index(){
        return "index";
    }
}
