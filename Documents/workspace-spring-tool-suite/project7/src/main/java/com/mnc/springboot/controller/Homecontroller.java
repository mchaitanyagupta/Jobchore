package com.mnc.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mnc.springboot.Entity.User;
import com.mnc.springboot.repository.Userrepo;
import com.mnc.springboot.service.Userserviceimpl;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
public class Homecontroller {
	@Autowired
	private Userserviceimpl userserviceimpl;

	@GetMapping("/")
	public String home() {
		return "welcome";
	}
	@PostMapping("/login")
	public String postMethodName(Model model) {
		model.addAttribute("luser", new User());
		//TODO: process POST request
		
		return "login";
	}
	@PostMapping("/loginn")
	public String logincheck(@ModelAttribute("luser") User user,Model model) {
		String lemail=user.getEmail();
		User cuser=userserviceimpl.findByEmail(lemail);
		if(cuser==null) {model.addAttribute("error", "user email naot found");return "/login";}
		if (cuser!=null && cuser.getPassword().equals(user.getPassword())) {
			model.addAttribute("un", cuser.getName());
			 return "/dashboard";
		}
		else{model.addAttribute("error", "incorrect password");
		model.addAttribute("ema", user.getEmail());return "/login";}
	}
	
	@PostMapping("/register")
	public String registrationmethod(Model model){
		model.addAttribute("user", new User());
		return "register";
	}
	@PostMapping("registersuccess")
	public String postMethodName(@ModelAttribute("user") User user) {
		userserviceimpl.save(user);	
		return "/login";
	}
	
	
}
