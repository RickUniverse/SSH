package com.ssh.test;

import com.ssh.utils.HibernateUtils;
import org.junit.Test;

/**
 * @author lijichen
 * @date 2020/11/19 - 16:26
 */
public class TestHibernate {
    @Test
    public void test() {
        HibernateUtils.getInstance().getSession();
    }
}
