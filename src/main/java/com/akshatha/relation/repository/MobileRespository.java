package com.akshatha.relation.repository;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.akshatha.relation.Entity.MobileEntity;

public class MobileRespository {
	
public MobileRespository() {
	System.out.println("created :\t" +this.getClass().getSimpleName());
}
public void save(MobileEntity entity) {
	SessionFactory factory = new Configuration().configure("resource/hibernate-cfg.xml").buildSessionFactory();
	Session session = factory.openSession();
	try {
		session.beginTransaction();
		session.save(entity);
		session.getTransaction().commit();
	} catch (Exception e) {
		session.getTransaction().rollback();
		e.printStackTrace();
	}finally {
		session.close();
		factory.close();
	}
}

}
