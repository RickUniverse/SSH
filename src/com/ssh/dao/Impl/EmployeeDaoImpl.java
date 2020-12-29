package com.ssh.dao.Impl;

import com.ssh.dao.EmployeeDao;
import com.ssh.entities.Employee;
import com.ssh.utils.BaseDao;
import com.ssh.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author lijichen
 * @date 2020/11/20 - 15:24
 */
public class EmployeeDaoImpl extends BaseDao implements EmployeeDao {



    @Override
    public List<Employee> getAllEmployee() {
        String sql = "FROM Employee e LEFT JOIN FETCH Department d Where e.department.id = d.id";
        return getSession().createQuery(sql).list();
    }

    @Override
    public void deleteEmployeeById(int id) {
//        getSession().delete(getSession().get(Employee.class,id));
        String hql = "delete from Employee e wherer e.id = ?1";
        getSession().createQuery(hql).setParameter(1,id).executeUpdate();
    }
}
