package com.company;

import com.company.aop.Performer;
import com.company.aop.UserManager;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-aop.xml");
        UserManager userManager = (UserManager) context.getBean("userManager");
        userManager.addUser("zhangsan","123456");

        userManager.findUserById(8888);
//        Performer performer = (Performer) context.getBean("langlang");
//        performer.perform();
    }
}
