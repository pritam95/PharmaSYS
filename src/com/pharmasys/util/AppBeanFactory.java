package com.pharmasys.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.pharmasys.constants.Config;
import com.pharmasys.beans.User;

public class AppBeanFactory {
	
	private static ApplicationContext context=new ClassPathXmlApplicationContext(Config.APPLICATIONCONTEXT_PATH);

	public static User getUser() {
		User user=(User)context.getBean("user");
		return user;
	}
}
