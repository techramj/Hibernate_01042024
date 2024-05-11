package com.seed.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.seed.model.User;

@Controller
public class LoginController {
	
	@RequestMapping(path = "/login" , method = RequestMethod.GET)
	public String login() {
		
		return "login"; //view
	}
	
	@RequestMapping(path = "/login" , method = RequestMethod.POST)
	public ModelAndView onLogin(@RequestParam String username, @RequestParam String password) {
		System.out.println("login button clicked. Username: "+username+"   password:"+password);
		//model and view
		ModelAndView mv = new ModelAndView();
		//logic
		if("123".equals(password)) {
			mv.setViewName("success");
			mv.addObject("user", username);
		}else {
			mv.setViewName("login");
			mv.addObject("error", "Invalid username and password");
		}
		
		return mv;
	}
	
	@RequestMapping(path = "/login1" , method = RequestMethod.GET)
	public ModelAndView login1() {
		User user = new User();
		ModelAndView mv = new ModelAndView("login1");
		mv.addObject("user", user);
		return mv; //view
	}
	
	
	@RequestMapping(path = "/login1" , method = RequestMethod.POST)
	public ModelAndView onLogin1(@ModelAttribute User user) {
		System.out.println("login button clicked. Username: "+user.getUsername()+"   password:"+user.getPassword());
		//model and view
		ModelAndView mv = new ModelAndView();
		//logic
		if("123".equals(user.getPassword())) {
			mv.setViewName("success1");
			mv.addObject("user", user);
		}else {
			mv.setViewName("login1");
			mv.addObject("error", "Invalid username and password");
		}
		
		return mv;
	}

}
