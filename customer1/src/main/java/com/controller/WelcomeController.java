package com.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.dao.CustomerDao;
import com.dao.CustomerDaoImp;
import com.entities.Customer;
import com.entities.CustomerLogin;

@Controller
//@SessionAttributes({"customer1"})
public class WelcomeController {
	
	@Autowired
	private CustomerDao customerDao;

	
	@RequestMapping("/")
	public String home(Model m) {
		String page= "home";
		m.addAttribute("page",page);
		return "home";
	}
	
	@RequestMapping("/signUp")
	public String signUp(Model m, @ModelAttribute("customer") Customer customer){
		String page = "signUp";
		m.addAttribute("page", page);
		return "signUp";
	}
	
	@RequestMapping(value = "/register",method = RequestMethod.POST)
	public String register(Model m, @Valid @ModelAttribute("customer") Customer customer,BindingResult br) {
		if(br.hasErrors()) {
			String page = "signUp";
			m.addAttribute("page", page);
			return "signUp";
		}
		String page = "register";
		System.out.println("Customer name :" + customer.getName());
		try {
			customerDao.saveOrUpdate(customer);
			m.addAttribute("customer1", customer);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("looks like the email is already bean registerd");
		}
		
		m.addAttribute("page", page);
		
		return "signUp";
	}
	
//	@RequestMapping(value = "/cart", method = RequestMethod.GET)
//	public String cart(@SessionAttribute("customer1") Customer customer) {
//		System.out.println(customer.getEmail());
//		return "cart";
//	}
//	
	@RequestMapping( "/allCustomers")
    public String allCustomers(Model m) {
		List<Customer> list = customerDao.list();
		System.out.println(list);
		m.addAttribute("list", list);
		return "allCustomers";
	}
	
	@RequestMapping("/login")
	public String login(Model m,@ModelAttribute("login") CustomerLogin login) {
		String page = "login";
		m.addAttribute("page",page);
		return "login";
	}
	
	@RequestMapping(value ="/signIn" ,method = RequestMethod.POST)
	public String signIn(Model m,@ModelAttribute("login") CustomerLogin login ) {
		String page;
		page ="login";
		System.out.println(login);
		String email = login.getEmail();
		String password = login.getPassword();
		try {
			Customer  customer = customerDao.get(email);
			System.out.println(customer);
			if(customer.getPassword().equals(password)) {
				page = "success";
				System.out.println("customer password match");
				m.addAttribute("page",page);
				m.addAttribute("customer", customer);
				return "signUp";
			}else {
				System.out.println("customer password doesnt match");
				m.addAttribute("error","customer password doesnt match");
			}
		} catch (Exception e) {
			// TODO: handle exception
			
			System.out.println("Looks like email Address Doesn't exist.");
			m.addAttribute("error","Looks like email Address Doesn't exist.");
		}
		
		
		m.addAttribute("page", page);
		return "login";
	}
	
	@RequestMapping("/about")
	public String about() {
		return "about";
	}
	
	@RequestMapping("/editProfile")
	public String editProfile(Model m,@RequestParam(required = false, name = "email") String email) {
		System.out.println("email to be edited "+email);
		Customer  customer = customerDao.get(email);
		m.addAttribute("customer", customer);
		return "editProfile";
	}
	
	@RequestMapping(value = "/edited",method = RequestMethod.POST)
	public String edited(Model m, @Valid @ModelAttribute("customer") Customer customer,BindingResult br) {
		if(br.hasErrors()) {
			String page = "signUp";
			m.addAttribute("page", page);
			return "signUp";
		}
		String page = "register";
		System.out.println("Customer name :" + customer.getName());
		customerDao.Update(customer);
		System.out.println(customer.getName()+" profile updated");
		m.addAttribute("page","register");
		return "signUp";
	}
	
	@RequestMapping("/deleteProfile")
	public String deleteProfile(Model m, @RequestParam(required= false, name = "email") String email) {
		customerDao.delete(email);
		m.addAttribute("page", "home");
		return "home";
	}
}
