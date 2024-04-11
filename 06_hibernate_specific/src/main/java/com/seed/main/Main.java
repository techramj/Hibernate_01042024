package com.seed.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.seed.entities.Student;
import com.seed.util.HibernateUtil;

public class Main {
	
	public static void main(String[] args) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Student stud = new Student();
		stud.setName("Sam");
		stud.setIsMarried("No");
		
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.save(stud);
		tx.commit();
		
		System.out.println(stud.getRollno());
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Session s1 = sf.openSession();
		Transaction tx2 = s1.beginTransaction();
		stud.setName("Jack");
		s1.saveOrUpdate(stud);
		tx2.commit();
		
	}

}
