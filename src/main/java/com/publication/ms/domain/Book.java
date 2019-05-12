package com.publication.ms.domain;

import java.util.Calendar;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
public class Book {

	@Id@GeneratedValue
	private Integer id;
	private String title;
	private Integer price;
	private Calendar dateOfPublish;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "isbn")
	private ISBN isbn;
	
}
