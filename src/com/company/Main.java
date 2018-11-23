package com.company;

import com.company.aop.Performer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-aop.xml");
        Performer performer = (Performer) context.getBean("langlang");
        performer.perform();
    }
}
