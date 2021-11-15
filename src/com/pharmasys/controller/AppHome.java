package com.pharmasys.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppHome {
	
	@RequestMapping("/apphome/orgform")
	public ModelAndView organizationForm(HttpServletRequest req,HttpServletResponse res) {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("organizationform");
		return mv;
	}

}
