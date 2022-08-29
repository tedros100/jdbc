package com.quintrix.maven.java.JdbcMysql;

public class Student {
	
	private int id;
	private String name;
	private String address;
	private String course_code;
	
	
	// return id
	public int getid() {
		return id;
	}	
	// set id
	public void setCustomers(int id) {
		this.id = id;
	}
	
	
	// return name
	public String getName() {
		return name;
	}	
	// set name
	public void setName(String name) {
		this.name = name;
	}
		
	
	// return address
	public String getAddress() {
		return address;
	}	
	// set address
	public void setAddress(String address) {
		this.address = address;
	}
		
	
	// return course_code
	public String getCourse_code() {
		return course_code;
	}	
	// set course_code
	public void setCourse_code(String course_code) {
		this.course_code = course_code;
	}
}
