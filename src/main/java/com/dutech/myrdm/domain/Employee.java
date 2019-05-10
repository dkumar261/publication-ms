package com.dutech.myrdm.domain;
	
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
@Entity
@Table(name = "EMPLOYEE")
public class Employee {

	@Column(name="FIRSTNAME")
	private String firstName;
	
	@Id
	private Long id;
	
	public String lastName;	
	
}
