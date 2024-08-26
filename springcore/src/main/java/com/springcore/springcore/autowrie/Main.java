package com.springcore.springcore.autowrie;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.springcore.autowriting.Student;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/springcore/autowire/autowrittingSpringConfig.xml");
		Student std = (Student) context.getBean("stdId");
	std.display();

	}

}
