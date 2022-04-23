package com.xucg.spring5.test;

import com.xucg.spring5.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    @Test
    public void testUser(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans1.xml");
        User user = context.getBean("user",User.class);

        System.out.println(user);
        user.add();
    }
}
