package com.sysemployee.dao;

import java.util.List;

import com.sysemployee.model.DepartmentEntity;
import com.sysemployee.model.EmployeeEntity;

public interface EmployeeDAO {
	   public List<EmployeeEntity> getAllEmployees();
	    public List<DepartmentEntity> getAllDepartments();
	    public void addEmployee(EmployeeEntity employee);
}
