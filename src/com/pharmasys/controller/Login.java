package com.pharmasys.controller;

import java.io.IOException;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.pharmasys.beans.User;
import com.pharmasys.beans.abstrct.IUser;
import com.pharmasys.service.abstrct.IUserService;
import com.pharmasys.util.AppBeanFactory;
import com.pharmasys.util.AppDateUtil;

@Controller
public class Login {
	
	@RequestMapping("/")
	public ModelAndView home(HttpServletRequest req,HttpServletResponse res) {
		ModelAndView mv=new ModelAndView();
		System.out.println("home Page");
		mv.setViewName("home");
		return mv;
	}
	
	@RequestMapping("/registrationForm")
	public ModelAndView registrationForm(HttpServletRequest req,HttpServletResponse res) {
		ModelAndView mv=new ModelAndView();
		System.out.println("Register Page");
		mv.setViewName("register");
		return mv;
	}
	
	
	@RequestMapping(value = "/doRegistration", method = RequestMethod.POST)
	public @ResponseBody String doRegistration(HttpServletRequest req,HttpServletResponse res) {
		IUser newUser=AppBeanFactory.getUser();
		newUser.setFirst_name(req.getParameter(IUser.REQUEST_PARAM_f_name));
		newUser.setLast_name(req.getParameter(IUser.REQUEST_PARAM_l_name));
		newUser.setGender(req.getParameter(IUser.REQUEST_PARAM_gender));
		String dob=req.getParameter(IUser.REQUEST_PARAM_dob);
		newUser.setDob(AppDateUtil.stringToDate(dob));
		newUser.setAddress(req.getParameter(IUser.REQUEST_PARAM_address));
		newUser.setPhone_no(req.getParameter(IUser.REQUEST_PARAM_phoneNo));
		newUser.setState(req.getParameter(IUser.REQUEST_PARAM_state));
		newUser.setPin_no(req.getParameter(IUser.REQUEST_PARAM_pinNo));
		newUser.setEmergency_no(req.getParameter(IUser.REQUEST_PARAM_emerPhoneNo));
		newUser.setEmail(req.getParameter(IUser.REQUEST_PARAM_email));
		newUser.setPassword(req.getParameter(IUser.REQUEST_PARAM_password));
		newUser.setActive_status("N");
		newUser.setUser_access("5");
		
		IUserService uS=AppBeanFactory.getUserService();
		uS.register(newUser);
		
		JSONObject response=new JSONObject();
		response.put("response", "success");
		System.out.println(response);
		return response.toString();
	}
}
