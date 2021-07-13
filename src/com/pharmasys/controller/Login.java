package com.pharmasys.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.pharmasys.beans.User;
import com.pharmasys.util.AppBeanFactory;

@Controller
public class Login {
	
	@RequestMapping("/")
	public ModelAndView home(HttpServletRequest req,HttpServletResponse res) {
		ModelAndView mv=new ModelAndView();
		User u=AppBeanFactory.getUser();
		u.setName("PhamaSYS");
		System.out.println(u.getName());
		mv.setViewName("home");
		return mv;
	}
}
