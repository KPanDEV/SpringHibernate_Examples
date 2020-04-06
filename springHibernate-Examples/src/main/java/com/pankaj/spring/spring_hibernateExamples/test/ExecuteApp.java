package com.pankaj.spring.spring_hibernateExamples.test;

import java.math.BigDecimal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pankaj.spring.spring_hibernateExamples.hibernateConfiguration.AppConfig;
import com.pankaj.spring.spring_hibernateExamples.model.Employee;
import com.pankaj.spring.spring_hibernateExamples.service.EmployeeService;

public class ExecuteApp {

	public static void main(String[] args) {
     ApplicationContext appcnxt = new  AnnotationConfigApplicationContext(AppConfig.class);
     EmployeeService service = (EmployeeService) appcnxt.getBean("employeeService");
     
     /*
		 * Create Employee1
		 */
		Employee employee1 = new Employee();
		employee1.setEmployeeName("Pankaj");
		employee1.setSalary(new BigDecimal(10000));
		employee1.setSsn("ssn00000003");

		/*
		 * Create Employee2
		 */
		Employee employee2 = new Employee();
		employee2.setEmployeeName("Singh");
		employee2.setSalary(new BigDecimal(20000));
		employee2.setSsn("ssn00000004");

		/*
		 * Persist both Employees
		 */
		service.saveEmployee(employee1);
		service.saveEmployee(employee2);


	}

}
