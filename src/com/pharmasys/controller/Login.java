package com.pharmasys.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.pharmasys.beans.User;
import com.pharmasys.beans.abstrct.IUser;
import com.pharmasys.service.abstrct.IUserService;
import com.pharmasys.util.AppBeanFactory;

@Controller
public class Login {
	
	@RequestMapping("/")
	public ModelAndView home(HttpServletRequest req,HttpServletResponse res) {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("home");
		return mv;
	}
	
	@RequestMapping("/register")
	public ModelAndView register(HttpServletRequest req,HttpServletResponse res) {
		ModelAndView mv=new ModelAndView();
		IUser u=AppBeanFactory.getUser();
		System.out.println("Register Page");
		mv.setViewName("register");
		return mv;
	}
}
