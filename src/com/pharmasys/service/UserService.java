package com.pharmasys.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pharmasys.beans.abstrct.IUser;
import com.pharmasys.dao.UserDAO;
import com.pharmasys.service.abstrct.IUserService;

@Component
public class UserService implements IUserService{

	@Autowired
	private UserDAO userDao;

	public UserDAO getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDAO userDao) {
		this.userDao = userDao;
	}
	
	public void register(IUser u) {
		userDao.createUser(u);
	}
}
