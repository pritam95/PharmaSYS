package com.pharmasys.controller;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.simple.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.pharmasys.beans.User;
import com.pharmasys.beans.abstrct.IRole;
import com.pharmasys.beans.abstrct.IUser;
import com.pharmasys.service.abstrct.IRoleService;
import com.pharmasys.service.abstrct.IUserService;
import com.pharmasys.util.AppBeanFactory;
import com.pharmasys.util.AppDateUtil;
import com.pharmasys.util.to.TransferObject;

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
		List<IRole> allRoles = null;
		IRoleService roleService = AppBeanFactory.getRoleService();
		TransferObject<List<IRole>> output = roleService.getAllRoles();
		if(output != null) {
			allRoles = output.getObj();
		}
		if(allRoles != null) {
			mv.addObject("roles", allRoles);
		}
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
		newUser.setUser_access(req.getParameter(IUser.REQUEST_PARAM_userAcces));
		
		IUserService uS=AppBeanFactory.getUserService();
		uS.register(newUser);
		
		JSONObject response=new JSONObject();
		response.put("response", "success");
		System.out.println(response);
		return response.toString();
	}
	
	@RequestMapping(value = "/doLogin", method = RequestMethod.POST)
	public ModelAndView doLogin(HttpServletRequest req,HttpServletResponse res) {
		ModelAndView mv=new ModelAndView();
		IUser user=AppBeanFactory.getUser();
		user.setPhone_no(req.getParameter(IUser.REQUEST_PARAM_phoneNo));
		user.setPassword(req.getParameter(IUser.REQUEST_PARAM_password));
		TransferObject<IUser> input = new TransferObject<IUser>();
		input.setObj(user);
		IUserService uS=AppBeanFactory.getUserService();
		IUser userData = uS.doLogin(input).getObj();
		if(userData != null) {
			System.out.println(userData.getFirst_name());
			mv.setViewName("apphome");
			
		}else {
			mv.setViewName("home");
			mv.addObject("response", "Invalid Phone No or Password");
		}
		
		return mv;
	}
}
