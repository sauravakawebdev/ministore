package com.practice.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.practice.entity.ContactUs;
import com.practice.services.ContactUsService;

@Controller
public class ContactController 
{
	@Autowired
	ContactUsService contactUsService;
	
	@GetMapping("/add-contact")
	public String ContactUsForm(Model model)
	{
		ContactUs contact = new ContactUs();
		model.addAttribute("Contacts",contact);
		return "contact_Us";
	}
	
	@RequestMapping(path = "/ContactUsMessage" , method = RequestMethod.POST)
	public String handleContactForm(@ModelAttribute ContactUs contactUs, Model model)
	{
		contactUsService.saveAll(contactUs);
		return "ContactUsMessage";
	}
	
	@RequestMapping("/customerQuery")
	public String customerQuery(Model model) {
		model.addAttribute("customerQuery", contactUsService.findAll());
		return "customerQuery";
	}

}
