package com.seed.dao.impl;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.seed.dao.CarDao;
import com.seed.entities.Car;
import com.seed.util.HibernateUtil;

public class CarDaoImpl implements CarDao {
	
	private SessionFactory sf = HibernateUtil.getSessionFactory();

	@Override
	public Car save(Car car) {
		try(Session session = sf.openSession()){
			Transaction tx = session.beginTransaction();
			session.save(car);
			tx.commit();			
		}
		return car;
	}

	@Override
	public Car update(Car car) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Car findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Car findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
