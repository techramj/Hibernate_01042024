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
		System.out.println("SessionFactory object is created");
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public static void closeSessionFactory() {

		if (sessionFactory != null) {
			sessionFactory.close();
		}

	}

}
