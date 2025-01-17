package com.springcore.springcore.autowriting;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
	
	@Bean
	public Adress createAdd1obj() {
		Adress add = new Adress();
		
		add.setHouseNo(196);
		add.setCity("Bhopal");
		add.setPincode(462016);
		
		return add;
	}
	
	@Bean
	public Adress createAdd2obj() {
		Adress add = new Adress();
		
		add.setHouseNo(65);
		add.setCity("Mumbai");
		add.setPincode(460001);
		
		return add;
	}

	@Bean
	public Subjects createSubobj() {
		
		Subjects sub = new Subjects();
		
		List<String> subjects_list = new ArrayList<String>();
		subjects_list.add("Java");
		subjects_list.add("OS");
		subjects_list.add("Python");
		sub.setSubjects(subjects_list);
		
		return sub;
		
	}

	@Bean
  public Student createStudobj() {
	  Student s1 = new Student();
	  
	  s1.setName("Bhupendra");
	  s1.setRoolNo(193);
//	  s1.setAdress(createAddobj()); // Manual dependency injection or no autowiring done .
//	  s1.setSubjects(createSubobj());
	  return s1;
	  
  }


	

}
