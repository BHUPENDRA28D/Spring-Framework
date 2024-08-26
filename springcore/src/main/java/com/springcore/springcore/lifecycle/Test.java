package com.springcore.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	public static void main(String[] args) {
		
		
	ApplicationContext context = 	new ClassPathXmlApplicationContext("com/springcore/springcore/lifecycle/samosaconfig.xml");
      
	Samosa samosa1 = (Samosa) context.getBean("samosa1");
	System.out.println(samosa1);
	}

}
