package com.springcore.springcore.autowriting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
	
	private String name;
	private int roolNo;
	
	@Autowired
	@Qualifier("createAdd2obj")
	 private Adress adress;
	
	@Autowired
	private Subjects subjects;
	
	
	
	public Subjects getSubjects() {
		return subjects;
	}
	public void setSubjects(Subjects subjects) {
		this.subjects = subjects;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setRoolNo(int roolNo) {
		this.roolNo = roolNo;
	}
	
	public void setAdress(Adress adress) {
		this.adress = adress;
	}
	
	public void display() {
		System.out.println("Student:\nname=" + name + "\nroolNo=" + roolNo + "\nadress=" + adress+
				"\nSubjects = "+subjects);
	}
	

}
