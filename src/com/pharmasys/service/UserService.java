package com.pharmasys.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pharmasys.beans.abstrct.IUser;
import com.pharmasys.dao.abstrct.IUserDAO;
import com.pharmasys.service.abstrct.IUserService;

@Component
public class UserService implements IUserService{

	@Autowired
	private IUserDAO userDao;

	public IUserDAO getUserDao() {
		return userDao;
	}

	public void setUserDao(IUserDAO userDao) {
		this.userDao = userDao;
	}
	
	public void register(IUser u) {
		userDao.createUser(u);
	}
}
