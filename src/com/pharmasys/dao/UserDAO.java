package com.pharmasys.dao;

import javax.transaction.Transactional;

import org.hibernate.FlushMode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.pharmasys.beans.abstrct.IUser;
import com.pharmasys.dao.abstrct.IUserDAO;

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
		
		hibernateTemplate.getSessionFactory().getCurrentSession().setHibernateFlushMode(FlushMode.AUTO);
		
		hibernateTemplate.save(u);
		
	}

}
