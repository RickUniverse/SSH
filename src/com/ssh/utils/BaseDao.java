package com.ssh.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * @author lijichen
 * @date 2020/11/20 - 18:55
 */
public class BaseDao {
    private SessionFactory sessionFactory;
    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public Session getSession() {
        return this.sessionFactory.getCurrentSession();
    }
}
