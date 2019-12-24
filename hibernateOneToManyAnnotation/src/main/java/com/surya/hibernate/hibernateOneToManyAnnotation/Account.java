package com.surya.hibernate.hibernateOneToManyAnnotation;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Account {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	private Long id;
	
	@Column
	private String accountNo;

	@ManyToOne
	private Student student;
	
	public Account()
	{
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
}
