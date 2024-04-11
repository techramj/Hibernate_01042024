package com.seed.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.seed.entities.Employee;
import com.seed.entities.Passport;

public class HibernateUtil {

	private static SessionFactory sessionFactory;

	static {
		Configuration cfg = new Configuration();

		cfg.addAnnotatedClass(Employee.class);
		cfg.addAnnotatedClass(Passport.class);

		sessionFactory = cfg.buildSessionFactory();
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

}
