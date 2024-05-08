package com.seed.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import com.seed.entity.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;


@Primary
@Repository
@Transactional
public class EmployeeDaoImplUsingEM  implements EmployeeDao{
	
	//@Autowired
	@PersistenceContext
	private EntityManager em;

	@Override
	public Employee save(Employee emp) {
		em.persist(emp);
		return emp;
	}

	@Override
	public Employee update(Employee emp) {
		em.merge(emp);
		return emp;
	}

	@Override
	public void delete(int id) {
		em.remove(findById(id));
	}

	@Override
	public Employee findById(int id) {
		return em.find(Employee.class, id);
	}

	@Override
	public List<Employee> findAll() {
		Query query = em.createQuery("from Employee e");
		return query.getResultList();
	}

}
