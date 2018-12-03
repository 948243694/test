package com.brainstrongstu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController extends BaseController{

    @RequestMapping("/home")
    @ResponseBody
    public String home(){
       return "test";
    }

    @RequestMapping("/demo")
    public String demo() {
        return "demo";
    }
}
