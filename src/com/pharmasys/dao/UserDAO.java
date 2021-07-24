package com.pharmasys.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Component;

import com.pharmasys.beans.User;
import com.pharmasys.beans.abstrct.IUser;
import com.pharmasys.constants.Config;

@Component
public class UserDAO {
	
	public void createUser(IUser u) {
		Configuration con=new Configuration().configure(Config.HIBERNATECONFIG_PATH).addAnnotatedClass(User.class);
		StandardServiceRegistry sr= new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
	    SessionFactory sf = con.buildSessionFactory(sr);
	    Session session = sf.openSession();
	    Transaction tx=session.beginTransaction();
	    session.save(u);
	    tx.commit();
	}

}
