package com.capgemini.trainee.controllers;

import java.math.BigDecimal;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.capgemini.trainee.beans.Trainee;
import com.capgemini.trainee.service.TraineeService;

@Controller
public class CustomerActionController {
	@Autowired(required=true)
	TraineeService traineeService;
	

@RequestMapping(value="/add")
public ModelAndView addTrainee(@Valid @ModelAttribute("trainee")Trainee trainee,BindingResult result) {

	
	if(result.hasErrors())
		return new ModelAndView("addTrainee");
	trainee=traineeService.AddTrainee(trainee);
	
	return new ModelAndView("Success","trainee",trainee);
}

@RequestMapping(value="/log")
public ModelAndView showLogin(@Valid @ModelAttribute("trainee")Trainee trainee,BindingResult result,@RequestParam("user")String user,@RequestParam("pass")String pass) {
	
String message="Mobile No doesn't exists";
	
		
	if(user.equals("admin")&&pass.equals("admin"))
	
	{ 
		return new ModelAndView("menu");
	}
	else
	return new ModelAndView("index","message",message);
}	


}