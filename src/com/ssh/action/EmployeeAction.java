package com.ssh.action;

import com.opensymphony.xwork2.ActionSupport;
import com.ssh.entities.Employee;
import com.ssh.service.EmployeeService;
import org.apache.struts2.interceptor.RequestAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Map;

/**
 * @author lijichen
 * @date 2020/11/19 - 18:20
 */
public class EmployeeAction extends ActionSupport implements RequestAware {

//    private Employee employee;
//    public Employee getEmployee() {
//        return employee;
//    }
//    public void setEmployee(Employee employee) {
//        this.employee = employee;
//    }
    @Autowired
    private EmployeeService employeeService;
    public void setEmployeeService(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    public String list() {
//        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml","applicationContext-beans.xml"});
//        this.employeeService = context.getBean("employeeService",EmployeeService.class);

        request.put("employees",employeeService.getAllEmployee());

        return "list-success";
    }

    private int id;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String delete() {
        employeeService.delete(id);
        return "delete-success";
    }




    private Map<String, Object> request;
    @Override
    public void setRequest(Map<String, Object> map) {
        this.request = map;
    }
}
