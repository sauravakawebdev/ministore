package com.practice.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.practice.entity.BillingAddress;
import com.practice.entity.Products;
import com.practice.services.BillingAddressService;
import com.practice.services.ProductService;

@Controller

public class ProductDetailsController {
	@Autowired
	private ProductService productservice;
	
	@Autowired
	private BillingAddressService billingAddressService;
	
	
	@GetMapping("/productdetails/{pId}")
	public String productdetails(@PathVariable String pId, Model model )  {
		System.out.println("Producct Id : " + pId);
		
		model.addAttribute("product", productservice.getById(pId));
		
//		Categories categories = new Categories();
		
		//Products product = new Products();
		
	//	 List<String> Cateories = Arrays.asList("Mobile", "Laptop");
		 
		//model.addAttribute("product",product);
		//model.addAttribute("Categories",categories.findAll());
		//System.out.println(Categories);
				
//		for( Categories element : categories.findAll()){
//		   System.out.println( element.getType());
//			model.addAttribute("Categories",element.getType());
//		}
//		
		
		//System.out.println(categories);
		return "productdetails";
	}
	
	@RequestMapping("/chekout/{pId}")
	public String handle_checkout(@PathVariable String pId,HttpServletRequest request, Model model) {
		HttpSession session = request.getSession();
		if (session.getAttribute("customerCustomerUsers1") == null) {
			return "redirect:/customerlogin";
			
		}
		model.addAttribute("product",productservice.getById(pId));
		return "chekout";
	}
	
	@PostMapping("/chekout_form")
	public String handle_placing_order(@ModelAttribute BillingAddress billingAddress, Model model) {
		billingAddressService.saveAll(billingAddress);
		
		return "orderPlaced";
		
	}

}
