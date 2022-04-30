package com.practice.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.logging.log4j.message.ReusableMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.practice.entity.CustomerUser;
import com.practice.repositry.CustomerUserRepository;
import com.practice.services.CustomerUserService;

@Controller
public class CustomerController {
	
	@Autowired
	CustomerUserService customerUserService;
	
	@Autowired
	CustomerUserRepository customerUserRepository;
	
	@RequestMapping("/customerlogin")
	public String customerlogin() {
		return "login";
		
	}
	
	@PostMapping("/customerlogin")
	public String handle_customer_login(@ModelAttribute CustomerUser customerUser, HttpServletRequest request, Model model) {
		CustomerUser customerCustomerUsers1 = customerUserService.authenticaCustomerUser(customerUser.getUserName(), customerUser.getPass());
		
		if (customerCustomerUsers1 != null) {
			HttpSession session =  request.getSession();
			session.setAttribute("customerCustomerUsers1",customerCustomerUsers1);
			//model.addAttribute("customerCustomerUsers1", customerCustomerUsers1);
			return "customerpanel1";
		}
			
	
		model.addAttribute("message", "Invalid Credentials");
		return "login";
	}
	
	@RequestMapping("/customerpanel")
	public String customerPanel() {
		//HttpSession session = request.getSession();
		System.out.println("Customer Panel");
		return "customerpanel1";
		
	}
	
	@RequestMapping("/logoutuser")
	public String LogoutUser(HttpServletRequest request) {
		HttpSession session = request.getSession();
		session.invalidate();
		System.out.println("user logout");
		return "redirect:/customerlogin";
	}
	
	@RequestMapping("/customer_registration")
	public String customer_registration() {
		return "registration";
	}
	
	@PostMapping("/customer_registration")
	public String handle_customer_registration(@ModelAttribute CustomerUser customerUser, Model model) {
		customerUserService.saveAll(customerUser);
		return "login";
	}
}
