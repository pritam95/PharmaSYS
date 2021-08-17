package com.pharmasys.dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.pharmasys.beans.Role;
import com.pharmasys.beans.abstrct.IRole;
import com.pharmasys.dao.abstrct.IRoleDAO;
import com.pharmasys.util.to.TransferObject;

@Component
public class RoleDAO implements IRoleDAO{
	
	@Autowired
	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}


	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	public TransferObject<List<IRole>> getAllRoles(){
		
		TransferObject<List<IRole>> output= new TransferObject<List<IRole>>();
		
		DetachedCriteria crit = DetachedCriteria.forClass(Role.class);
		List<IRole> allRoles= (List<IRole>) hibernateTemplate.findByCriteria(crit);
		for(IRole r:allRoles) {
			System.out.println(r.getRoleName());
		}
		output.setObj(allRoles);
		return output;
		
	}

}
