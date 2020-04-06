package com.pankaj.spring.spring_hibernateExamples.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EMPLOYEE")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="SSN", unique=true, nullable =false)
	private String ssn;
	
	@Column(name="Salary",unique=false, nullable=false)
	private BigDecimal salary;
	
	@Column(name="EmployeeName", unique=false, nullable=false)
	private String employeeName;

	
	
	public int getId() {
		return id;
	}

	
	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal bigDecimal) {
		this.salary = bigDecimal;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((employeeName == null) ? 0 : employeeName.hashCode());
		result = prime * result + id;
		result = prime * result + ((salary == null) ? 0 : salary.hashCode());
		result = prime * result + ((ssn == null) ? 0 : ssn.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (employeeName == null) {
			if (other.employeeName != null)
				return false;
		} else if (!employeeName.equals(other.employeeName))
			return false;
		if (id != other.id)
			return false;
		if (salary == null) {
			if (other.salary != null)
				return false;
		} else if (!salary.equals(other.salary))
			return false;
		if (ssn == null) {
			if (other.ssn != null)
				return false;
		} else if (!ssn.equals(other.ssn))
			return false;
		return true;
	}
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", ssn=" + ssn + ", salary=" + salary + ", employeeName=" + employeeName + "]";
	}


	public void setName(String string) {
		// TODO Auto-generated method stub
		
	}
	

}

