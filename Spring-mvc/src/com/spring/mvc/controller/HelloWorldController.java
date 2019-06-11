package com.spring.mvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/hello")
public class HelloWorldController {
	
	@RequestMapping("/showForm")
	public String show()
	{
		return "helloworld-form";
	}
	
	@RequestMapping("/display")
	public String disp()
	{
		return "display-form";
	}
	
	@RequestMapping("/process")
	public String shoutDude(HttpServletRequest request, Model model)
	{
		String msg=request.getParameter("studentName");
		msg=msg.toUpperCase();
		String result="yo!"+msg;
		model.addAttribute("message", result);
	
		return "display-form";
	}
	
	@RequestMapping("/processOne")
	public String processOne(@RequestParam("studentName") String msg, Model model)
	{
		msg=msg.toUpperCase();
		String result="yo updated!"+msg;
		model.addAttribute("message", result);
	
		return "display-form";
	}
	

}
