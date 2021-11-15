package com.pharmasys.dao;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.FlushMode;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.pharmasys.beans.Role;
import com.pharmasys.beans.User;
import com.pharmasys.beans.abstrct.IRole;
import com.pharmasys.beans.abstrct.IUser;
import com.pharmasys.dao.abstrct.IUserDAO;
import com.pharmasys.util.to.TransferObject;

@Component
@Transactional
public class UserDAO implements IUserDAO{
	
	
	@Autowired
	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}


	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	
	public void createUser(IUser u) {
		
		/*Configuration con=new Configuration().configure(Config.HIBERNATECONFIG_PATH).addAnnotatedClass(User.class);
		StandardServiceRegistry sr= new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
	    SessionFactory sf = con.buildSessionFactory(sr);
	    Session session = sf.openSession();
	    Transaction tx=session.beginTransaction();
	    session.save(u);
	    tx.commit();*/
		
		Date curDate=new Date();
		
		u.setCreated_on(curDate);
		
		hibernateTemplate.getSessionFactory().getCurrentSession().setHibernateFlushMode(FlushMode.AUTO);
		
		hibernateTemplate.save(u);
		
	}
	
	public TransferObject<IUser> getUser(TransferObject<IUser> input){
		
		TransferObject<IUser> output= new TransferObject<IUser>();
		IUser user = input.getObj();
		DetachedCriteria crit = DetachedCriteria.forClass(IUser.class);
		crit.add(Restrictions.eq("phone_no",user.getPhone_no()));
		crit.add(Restrictions.eq("password", user.getPassword()));
		List<IUser> users= (List<IUser>) hibernateTemplate.findByCriteria(crit);
		if(users != null && !users.isEmpty()) {
			output.setObj(users.get(0));
		}
		return output;
	}

}
