package com.publication.ms.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.publication.ms.api.model.dto.AuthorDto;
import com.publication.ms.domain.Author;
import com.publication.ms.repository.AuthorRespository;

@Service
public class AuthorService {

	@Autowired
	private AuthorRespository authorRespository;
	
	@Autowired
	private ModelMapper mapper;
	
	public void addAuthor(AuthorDto authorDto) {
		
		Author author = mapper.map(authorDto, Author.class);
		authorRespository.save(author);
		System.out.println("Mapper Testing !!");
	}
}
