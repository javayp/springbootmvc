package com.sm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by prash on 11/22/2016.
 */

@Controller
public class IndexController {

    @RequestMapping("/")
    public String index(){
        return "index";
    }
}
