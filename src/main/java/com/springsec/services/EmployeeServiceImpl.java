package com.springsec.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springsec.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	public List<Employee> getEmployeesList() {
		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(new Employee(1, "Prince", "Sethi", "prince@gmail.com"));
		employeeList.add(new Employee(2, "Rambir", "Singh", "rambir@gmail.com"));
		employeeList.add(new Employee(3, "Vishnu", "Jangid", "vishnu@gmail.com"));
		return employeeList;
	}

}