package com.seed.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.seed.dao.EmployeeRepository;
import com.seed.entity.Employee;

@Service
@Primary
public class EmployeeServiceImplUpdated implements EmployeeService{
	
	@Autowired
	private EmployeeRepository empRepository;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeServiceImplUpdated.class);

	@Override
	public Employee addEmployee(Employee emp) {
		LOGGER.info("employee {} {} to be added...", emp.getId(), emp.getName());
		return empRepository.save(emp); 
	}

	@Override
	public Employee updateEmployee(int id, Employee emp) {
		emp.setId(id);
		return empRepository.save(emp);
	}

	@Override
	public void deleteEmployee(int id) {
		empRepository.deleteById(id);
		
	}

	@Override
	public Employee getEmployeeDetails(int id) {
		Optional<Employee> emp = empRepository.findById(id);
		return emp.orElse(null);
	}

	@Override
	public List<Employee> getAllEmployeesDetails() {
		return empRepository.findAll();
	}

}
