package com.springcore.springcore.autowrie;

public class Students {
	private String name;
	private int roolNo;
	
	
	Address address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	public void display() {
		System.out.println("Student:\nname=" + name + "\nroolNo=" + roolNo + "\nadress=" + address);
	}
	
	

}
