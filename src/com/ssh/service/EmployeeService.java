package com.ssh.service;

import com.ssh.dao.EmployeeDao;
import com.ssh.entities.Employee;

import java.util.List;

/**
 * @author lijichen
 * @date 2020/11/20 - 15:32
 */
public class EmployeeService {
    private EmployeeDao employeeDao;
    public EmployeeDao getEmployeeDao() {
        return employeeDao;
    }
    public void setEmployeeDao(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    public List<Employee> getAllEmployee() {
        return employeeDao.getAllEmployee();
    }

    public void delete(int id) {
        employeeDao.deleteEmployeeById(id);
    }
}
