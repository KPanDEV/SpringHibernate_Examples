package com.pankaj.spring.spring_hibernateExamples.dao;

import java.util.List;

import com.pankaj.spring.spring_hibernateExamples.model.Employee;

public interface EmployeeDao {
	
	void saveEmployee(Employee employee);
	
	List<Employee>findAllEmployees();
	
	void deleteEmployeeBySsn(String ssn);
	
	Employee findBySssn(String ssn);
	
	void updateEmploye(Employee employee);

}
