package com.pharmasys.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pharmasys.beans.abstrct.IRole;
import com.pharmasys.dao.abstrct.IRoleDAO;
import com.pharmasys.service.abstrct.IRoleService;
import com.pharmasys.util.to.TransferObject;

@Component
public class RoleService implements IRoleService{
	
	@Autowired
	private IRoleDAO roleDao;
	

	public IRoleDAO getRoleDao() {
		return roleDao;
	}


	public void setRoleDao(IRoleDAO roleDao) {
		this.roleDao = roleDao;
	}


	public TransferObject<List<IRole>> getAllRoles(){
		return roleDao.getAllRoles();
	}

}
