package com.example.howtowebsite;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/index")
    public String HomePage(){
        return "index";
    }

    @RequestMapping("/contact")
        public String Home(){
        return "Contact";
    }

    @RequestMapping("/about")
    public String About(){
        return "About";
    }
}
