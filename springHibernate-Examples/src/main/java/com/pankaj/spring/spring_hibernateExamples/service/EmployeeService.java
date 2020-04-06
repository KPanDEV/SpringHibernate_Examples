package com.pankaj.spring.spring_hibernateExamples.service;

import java.util.List;

import com.pankaj.spring.spring_hibernateExamples.model.Employee;

public interface EmployeeService {
	
    void saveEmployee(Employee employee);
	
	List<Employee>findAllEmployees();
	
	void deleteEmployeeBySsn(String ssn);
	
	Employee findBySssn(String ssn);
	
	void updateEmploye(Employee employee);

}
