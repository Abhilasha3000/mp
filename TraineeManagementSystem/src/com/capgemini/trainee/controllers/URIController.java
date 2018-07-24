package com.capgemini.trainee.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import com.capgemini.trainee.beans.Trainee;

@Controller
public class URIController {
	
	
	@RequestMapping(value="/")
	public String getIndexPage() {
		return "index";
	}
	
	
	
	@RequestMapping(value="addTrainee")
	public String getRegistrationPage() {
		return "addTrainee";
	}
	
	@RequestMapping(value="menu")
	public String getMenuPage() {
		return "menu";
	}
	
	
	
	@ModelAttribute("trainee")
	public Trainee getTrainee() {
		return new Trainee();
	}

	
	

}
