package com.example.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class WelcomeController {
    @RequestMapping("/hello")
    public String hello() {
        return "welcome";
}

    @RequestMapping("")
    public String index(){
        return "index";
    }

}
