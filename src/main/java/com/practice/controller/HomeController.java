package com.practice.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.practice.entity.Categories;
import com.practice.repositry.ProductRepositry;
import com.practice.services.CategoriesService;
import com.practice.services.ProductService;

//import com.boot.entity.Users;
//import com.boot.service.ContactService;
//import com.boot.service.UserService;

//import com.boot.entity.Users;
@Controller
public class HomeController {

	@Autowired
	private ProductService productservice;
	
	@Autowired
	private CategoriesService categoriesService;
	
	@Autowired
	private ProductRepositry productRepositry;
//
//	@Autowired
//	private ContactService contactDao;

	@RequestMapping("/")
	public String index(Model model,HttpServletRequest request) {
		
    	model.addAttribute("products",productservice.findAll());
		//Categories cat1 = categoriesService.getById(1);
		//Categories cat2 = categoriesService.getById(2);
		//model.addAttribute("productsMobile",productservice.getProductByCategory(1));
		//model.addAttribute("productsLaptop",productservice.getProductByCategory(2));
		//model.addAttribute("productsTablet",productservice.getProductByCategory(12));
		//model.addAttribute("productsMobile",productRepositry.getProductByCategoryId1());
//		
//		System.out.println(model);
		
		return "index";
	}
	@GetMapping("/index")
	public String getHomePage(Model model, HttpServletRequest request) {
	//	HttpSession session = request.getSession();
	//	Users user = (Users) session.getAttribute("currentUser");
/*		if (user == null)
			return "redirect:/";
		else {
		//	model.addAttribute("contacts", contactDao.getUserContacts(user));
		}*/
		return "home";
	}

}
