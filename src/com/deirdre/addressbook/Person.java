package com.deirdre.addressbook;

public class Person {
	
	private String firstname;
	private String surname;
	private String address_line_1;
	private String address_line_2;
	private String address_line_3;
	private String mobile;

	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getAddress_line_1() {
		return address_line_1;
	}
	public void setAddress_line_1(String address_line_1) {
		this.address_line_1 = address_line_1;
	}
	public String getAddress_line_2() {
		return address_line_2;
	}
	public void setAddress_line_2(String address_line_2) {
		this.address_line_2 = address_line_2;
	}
	public String getAddress_line_3() {
		return address_line_3;
	}
	public void setAddress_line_3(String address_line_3) {
		this.address_line_3 = address_line_3;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
}
