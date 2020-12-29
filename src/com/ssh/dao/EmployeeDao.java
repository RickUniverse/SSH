package com.ssh.dao;

import com.ssh.entities.Employee;

import java.util.List;

/**
 * @author lijichen
 * @date 2020/11/20 - 15:22
 */
public interface EmployeeDao {
    //获取所有Employee
    List<Employee> getAllEmployee();
    void deleteEmployeeById(int id);
}
