package com.progrank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class LoginController {
	
	@RequestMapping("/")
 public String login(@ModelAttribute("objuser")UserLogin User) {
		
	 return "login";
	}
	 @RequestMapping("/Login-panel")
	 public String home(@ModelAttribute("objuser")UserLogin login,Model model,@RequestParam("action") String click) {
		 
		 if(click.equalsIgnoreCase("login")){

		 
		 if(login.getUserName().contentEquals("Abhi") && login.getUserPasswd().equals("9583"))
		 {
		
		 
		 return "home";
		 }
		 else {
			 model.addAttribute("msg","Invalid ");
			 return "login";
		 }
		 }
		 else if(click.equalsIgnoreCase("register now")){
			return "redirect:/registration";
			 
		 }
		return "login";
		 
 }
}
