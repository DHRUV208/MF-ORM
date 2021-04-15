package com.example.Controller;


import com.example.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class WelcomeController {

    @RequestMapping("details")
    public String welcome(@ModelAttribute("ModelAttrib")User user){
     return "welcome";
    }

    @RequestMapping(value="details",method=RequestMethod.POST)
    public String details(@ModelAttribute("ModelAttrib")User user,Model model){
        model.addAttribute("fname",user.getFname());
        model.addAttribute("lname",user.getLname());
        model.addAttribute("dob",user.getDob());
        model.addAttribute("about",user.getAbout());
        model.addAttribute("hobby",user.getHobby());
        return "yourDetails";
    }

    @RequestMapping(value="login3",method = RequestMethod.POST)
    public String login3(@ModelAttribute("ModelAttrib") User user, Model model){

        model.addAttribute("name",user.getName());
        model.addAttribute("password", user.getPassword());
        model.addAttribute("email", user.getEmail());
        return "welcome";

    }
    @RequestMapping("")
    public String index(@ModelAttribute("ModelAttrib") User user){
        return "home";}
}
