package com.ssh.entities;

import java.util.Date;

/**
 * @author lijichen
 * @date 2020/11/19 - 16:03
 */
public class Employee {
    private Integer id;
    //不能被修改
    private String lastName;
    private String email;

    //从前端传过来的是string 类型需要转换
    private Date birth;

    //不能被修改
    private Date createTime;
    //单向n-1 的关系
    private Department department;

    public Employee() {
    }

    public Employee(Integer id, String lastName, String email, Date birth, Date createTime, Department department) {
        this.id = id;
        this.lastName = lastName;
        this.email = email;
        this.birth = birth;
        this.createTime = createTime;
        this.department = department;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", birth=" + birth +
                ", createTime=" + createTime +
                ", department=" + department +
                '}';
    }
}
