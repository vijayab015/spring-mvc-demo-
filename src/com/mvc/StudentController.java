package com.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("student")
public class StudentController {
	
	@RequestMapping("showForm")
	public String showForm(Model theModel)
	{
		Student st=new Student();
		
		theModel.addAttribute("student1", st);
		
		return "student-form";
	}

	@RequestMapping("processForm")
	public String processForm(@ModelAttribute("student1") Student theStudent)
	{
		System.out.println("Hello -");
		System.out.println(theStudent.getFirtsName());
		
		return "student_confirmation";
		
	}
}
