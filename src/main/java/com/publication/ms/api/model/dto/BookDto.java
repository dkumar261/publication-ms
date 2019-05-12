package com.publication.ms.api.model.dto;

import java.util.Calendar;

import com.publication.ms.domain.ISBN;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class BookDto {

	private Integer id;
	private String title;
	private Integer price;
	private Calendar dateOfPublish;
	
	private ISBN isbn;
	
}
