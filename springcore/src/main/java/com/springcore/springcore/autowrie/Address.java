package com.springcore.springcore.autowrie;

public class Address {
	private int houseNo;
	private String city;
	private int pincode;
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(int houseNo, String city, int pincode) {
		super();
		this.houseNo = houseNo;
		this.city = city;
		this.pincode = pincode;
	}
	
	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	
	@Override
	public String toString() {
		return "#"+houseNo+ " , "+city+" , "+pincode+" ";
	}
	

}