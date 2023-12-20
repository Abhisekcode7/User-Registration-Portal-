package com.progrank.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.progrank.model.UserRegDTO;
import com.progrank.service.UserService;

@Controller

public class UserRegistrationController {
	@Autowired
	
	UserService service;
	
	@RequestMapping("/registration")
public ModelAndView register() {
	return new ModelAndView ("register","objReg",new UserRegDTO());
}
	@ModelAttribute("countryList")
	public Map<String,String> countries(){
		Map<String,String> map = new HashMap<String, String>();
		map.put("SI", "Singapore");
		map.put("Ind", "India");
		map.put("USA", "United State");
		return map;
	}
	@RequestMapping("/ProcessRegistration")
public ModelAndView processReg(@ModelAttribute("objReg") UserRegDTO user) {
	if(service.registerUser(user)) {
		return new ModelAndView ("login","objuser",new UserLogin());
	}
	return new ModelAndView ("register","objReg",new UserRegDTO( "reg failed"));
}
}
