package com.publication.ms.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table
public class Author {

	@Id @GeneratedValue
	private Long id;
    public String firstName;
    public String lastName;	
}
