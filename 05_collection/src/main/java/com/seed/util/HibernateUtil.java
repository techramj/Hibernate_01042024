package com.seed.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.seed.entities.Employee;

public class HibernateUtil {
	
	private static SessionFactory sessionFactory;
	
	
	static {
		Configuration cfg = new Configuration();
		
		cfg.addAnnotatedClass(Employee.class);
		
		sessionFactory = cfg.buildSessionFactory();
	}
	
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

}
