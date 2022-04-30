package com.practice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class aboutUsController 
{
	@RequestMapping("/aboutus")
	public String AboutUs()
	{
		return "aboutUs";
	}
}
