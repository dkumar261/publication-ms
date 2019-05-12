package com.publication.ms.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
public class ISBN {
	
	@Id@GeneratedValue
	private Integer id;
	private Integer number;
}
