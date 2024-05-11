package com.seed.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seed.dao.EmployeeRepository;
import com.seed.dto.EmployeeDto;
import com.seed.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository empRepository;

	private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeServiceImpl.class);

	@Override
	public EmployeeDto addEmployee(EmployeeDto empDto) {
		Employee emp = empRepository.save(convertEmployeeFromDto(empDto));
		return convertEmployeeDtoFromEmployee(emp);
	}

	@Override
	public EmployeeDto updateEmployee(int id, EmployeeDto empDto) {
		empDto.setId(id);
		Employee emp = empRepository.save(convertEmployeeFromDto(empDto));
		return convertEmployeeDtoFromEmployee(emp);
	}

	@Override
	public void deleteEmployee(int id) {
		empRepository.deleteById(id);
	}

	@Override
	public EmployeeDto getEmployeeDetails(int id) {
		Optional<Employee> emp = empRepository.findById(id);
		if(emp.isPresent()) {
			return convertEmployeeDtoFromEmployee(emp.get());
		}
		return null;
	}

	@Override
	public List<EmployeeDto> getAllEmployeesDetails() {
		List<Employee> empList = empRepository.findAll();
		return convertToEmployeeDtoList(empList);
	}
	
	private Employee convertEmployeeFromDto(EmployeeDto dto) {
		Employee emp = new Employee();
		emp.setId(dto.getId());
		emp.setName(dto.getName());
		emp.setSalary(dto.getSalary());
		return emp;
	}
	
	private EmployeeDto convertEmployeeDtoFromEmployee(Employee emp) {
		EmployeeDto dto = new EmployeeDto();
		dto.setId(emp.getId());
		dto.setName(emp.getName());
		dto.setSalary(emp.getSalary());
		return dto;
	}
	
	private List<EmployeeDto> convertToEmployeeDtoList(List<Employee> empList){
		List<EmployeeDto> dtos = new ArrayList<EmployeeDto>();
		for(Employee emp:empList) {
			dtos.add(convertEmployeeDtoFromEmployee(emp));
		}
		return dtos;
	}

}
