package com.springsec.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.springsec.services.EmployeeService;

/**
 * @author Sumit
 *
 */
@RestController
public class EmployeeRestController {

	@Autowired
	EmployeeService employeeService;

	@RequestMapping(value = "/api/user_list", method = RequestMethod.GET)
	public List getemployees() {
		System.out.println("RestController.list()");
		return employeeService.getEmployeesList();
	}
}
