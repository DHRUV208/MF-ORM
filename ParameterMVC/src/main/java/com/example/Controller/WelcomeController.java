package com.example.Controller;


import com.example.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;



@Controller
public class WelcomeController {

    @RequestMapping("login")
    public String login(HttpServletRequest request, Model model){
        String username = request.getParameter("name");
        String password = request.getParameter("password");
        String check = "Dg2018";
        if(password.compareTo(check)==0){
            model.addAttribute("username",username);
            return "welcome";
        }

        model.addAttribute("username","Invalid Credentials");
        return "index";

    }
    @RequestMapping("login2")
    public String login2(@RequestParam("name")String username, @RequestParam("password")String password, Model model){
        String check = "Dg2018";
        if(password.compareTo(check)==0){
            model.addAttribute("username",username);
            return "welcome";
        }
        model.addAttribute("username","Invalid Credentials");
        return "index";
    }

    @RequestMapping(value="login3",method = RequestMethod.POST)
    public String login3(@ModelAttribute("modelAtt")User user, Model model){
        String check = "Dg2018";
        model.addAttribute("login", new User());
        if(user.getPassword().compareTo(check)==0) {
            model.addAttribute("username", user.getName());
            return "welcome";
        }
        model.addAttribute("username","Invalid Credentials");
        return "index";

    }
    @RequestMapping("")
    public String index(@ModelAttribute("modelAtt")User user){
        return "index";}
}
