/**
 * 
 */
package com.sysemployee.service;

import java.util.List;

import com.sysemployee.model.DepartmentEntity;
import com.sysemployee.model.EmployeeEntity;

/**
 * @author Shilpa
 *
 */
public interface EmployeeManager 
{
    public List<EmployeeEntity> getAllEmployees();
    public List<DepartmentEntity> getAllDepartments();
    public void addEmployee(EmployeeEntity employee);
}