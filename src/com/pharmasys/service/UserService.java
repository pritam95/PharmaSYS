package com.pharmasys.service;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pharmasys.beans.abstrct.IUser;
import com.pharmasys.dao.abstrct.IUserDAO;
import com.pharmasys.service.abstrct.IUserService;
import com.pharmasys.util.to.TransferObject;

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
		u.setPassword(convertToSHA256(u.getPassword()));
		userDao.createUser(u);
	}
	
	public TransferObject<IUser> doLogin(TransferObject<IUser> u){
		IUser user = u.getObj();
		user.setPassword(convertToSHA256(user.getPassword()));
		TransferObject<IUser> output = userDao.getUser(u);
		return output;
	}
	
	private String convertToSHA256(String pass) {
		StringBuilder hexString = null;
		try {
			MessageDigest md = MessageDigest.getInstance("SHA-256");
			byte[] hash = md.digest(pass.getBytes(StandardCharsets.UTF_8));
			BigInteger number = new BigInteger(1, hash);
			hexString = new StringBuilder(number.toString(16));
			while (hexString.length() < 32) 
	        { 
	            hexString.insert(0, '0'); 
	        }
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} 
		return hexString.toString();
	}
}
