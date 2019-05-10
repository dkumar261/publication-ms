package com.dutech.myrdm.domain;

import javax.persistence.Id;

//@Entity
//@Table(name = "ADDRESS")
//@Data
public class Address {

	@Id
	private int id;
	
	private String homeCity;
	
}
