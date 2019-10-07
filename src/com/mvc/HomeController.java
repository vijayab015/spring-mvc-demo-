package com.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.annotation.RequestScope;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String showPage()
	{
		return "main-menu";
	}
	

}
