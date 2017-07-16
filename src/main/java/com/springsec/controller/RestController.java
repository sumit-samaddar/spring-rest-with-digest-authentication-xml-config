package com.springsec.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.springsec.model.Employee;
import com.springsec.services.EmployeeService;

@Controller
// @RequestMapping()
public class RestController {

	@Autowired
	EmployeeService employeeService;

	@RequestMapping(value = "/api/users", method = RequestMethod.GET)
	@ResponseBody
	public List<Employee> list() {
		System.out.println("RestController.list()");
		return employeeService.getEmployeesList();
	}

}
