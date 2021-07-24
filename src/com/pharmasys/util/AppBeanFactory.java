package com.pharmasys.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.pharmasys.constants.Config;
import com.pharmasys.service.abstrct.IUserService;
import com.pharmasys.beans.abstrct.IUser;

public class AppBeanFactory {
	
	private static ApplicationContext context=new ClassPathXmlApplicationContext(Config.APPLICATIONCONTEXT_PATH);

	public static IUser getUser() {
		IUser user=(IUser)context.getBean("user");
		return user;
	}
	
	public static IUserService getUserService() {
		IUserService userService=(IUserService)context.getBean("userService");
		return userService;
	}
}
