package com.pankaj.spring.spring_hibernateExamples.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pankaj.spring.spring_hibernateExamples.dao.EmployeeDao;
import com.pankaj.spring.spring_hibernateExamples.model.Employee;

@Service("employeeService")
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;
	
	@Override
	public void deleteEmployeeBySsn(String ssn) {
	   employeeDao.deleteEmployeeBySsn(ssn);

	}

	public void saveEmployee(Employee employee) {
		employeeDao.saveEmployee(employee);
		
	}

	public List<Employee> findAllEmployees() {
	    
		return (employeeDao.findAllEmployees());
	}

	
	public Employee findBySssn(String ssn) {
		// TODO Auto-generated method stub
		return (employeeDao.findBySssn(ssn));
	}

	
	public void updateEmploye(Employee employee) {
      employeeDao.updateEmploye(employee);
		
	}

}
