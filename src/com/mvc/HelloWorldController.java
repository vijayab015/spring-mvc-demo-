package com.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("hello")  //optional request mapping here
public class HelloWorldController {
	
	@RequestMapping("/showform")
	public String showFrom()
	{
		return "helloworld-form";
	}

	@RequestMapping("/processfrom")
	public String processFrom() 
	{
		return "helloworld";
	}
	
	@RequestMapping("/processfromVersionTwo")
	
	public String sayHello(HttpServletRequest request,Model model)
	{
		
		String theName=request.getParameter("studentName"); //getting data from JSP or form
		
		String result ="Hello "+theName;
		model.addAttribute("message", result);   //Adding in the Model
		
			
		return "helloworld";
	}
	
@RequestMapping("/processfromVersionThree")
	
	public String sayHelloAnno(@RequestParam("studentName") String theName ,Model model) // directly getting from Form via Annonation 
	{
		
		
		String result ="Hello  Annonation "+theName;
		model.addAttribute("message", result);   //Adding in the Model
		
			
		return "helloworld";
	}
	
}
