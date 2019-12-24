package com.surya.hibernate.hibernateOneToManyAnnotation;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Employee {
	
	@Column
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column
	private String name;
	
	@OneToMany(cascade=CascadeType.ALL)
//	@JoinTable(name = "EMPLOYEE_DEPARTMENT",
//			joinColumns= {@JoinColumn(name = "employee_id", referencedColumnName="department_id"}, inv)
    @JoinTable(name="EMPLOYEE_ACCOUNT", 
            joinColumns={@JoinColumn(name="EMPLOYEE_ID", referencedColumnName="ID")}
			    , inverseJoinColumns={@JoinColumn(name="ACCOUNT_ID", referencedColumnName="ID")})
	private Set<Department> departments;
	
	
	public Employee() {
	}
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
	public Set<Department> getDepartments() {
		return departments;
	}
	public void setDepartments(Set<Department> departments) {
		this.departments = departments;
	}
	


}
