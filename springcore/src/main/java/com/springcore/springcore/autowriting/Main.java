package com.springcore.springcore.autowriting;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context =    new AnnotationConfigApplicationContext(SpringConfig.class);
		
		Student std = context.getBean(Student.class);
		std.display();
		
//		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/springcore/autowriting/autowrittingSpringConfig.xml");
//		Student std = (Student) context.getBean("autowrittingSpringConfig.xml");
//		std.display();
		

	}

}
