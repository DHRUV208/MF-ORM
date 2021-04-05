package com.example.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;


@Controller
public class WelcomeController {
    @RequestMapping("/hello")
    public String hello(HttpServletRequest request, Model model) {
        String username = request.getParameter("name");
        model.addAttribute("username",username);
        return "welcome";
}

    @RequestMapping("")
    public String index(){
        return "index";
    }

}
