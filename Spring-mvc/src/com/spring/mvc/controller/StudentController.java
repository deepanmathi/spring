package com.spring.mvc.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.mvc.bean.Student;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@Value("#{countryUtilOptions}") 
	public Map<String, String> countryUtilOptions;
	
	@RequestMapping("/showForm")
	public String showForm(Model theModel)
	{
		Student theStudent=new Student();
		theModel.addAttribute("student", theStudent);
		theModel.addAttribute("theCountryOptions", countryUtilOptions); 
		return "student-form";
	}
	
	@RequestMapping("/processForm")
	public String processFormStudent(@ModelAttribute("student") Student theStudent)
	{
		System.out.println("innnnn==" +theStudent.getFirstName());
		return "student-confirmation";
	}

}
