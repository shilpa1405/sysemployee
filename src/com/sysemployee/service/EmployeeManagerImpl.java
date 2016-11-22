package com.sysemployee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sysemployee.dao.EmployeeDAO;
import com.sysemployee.model.DepartmentEntity;
import com.sysemployee.model.EmployeeEntity;

@Service
public class EmployeeManagerImpl implements EmployeeManager {

	@Autowired
	EmployeeDAO dao;

	public List<EmployeeEntity> getAllEmployees() {
		return dao.getAllEmployees();
	}

	public List<DepartmentEntity> getAllDepartments() {
		return dao.getAllDepartments();
	}

	public void addEmployee(EmployeeEntity employee) {
		dao.addEmployee(employee);
	}
}
