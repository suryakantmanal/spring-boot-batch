package com.surya.test.contenttypeexample;

import javax.xml.bind.annotation.XmlRootElement;

public class Student {
	
	private Long id;
	private String name;
	private String department;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}

}
