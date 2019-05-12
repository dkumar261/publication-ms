package com.publication.ms.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.publication.ms.api.model.dto.AuthorDto;
import com.publication.ms.service.AuthorService;


@RestController
@RequestMapping(path="/author")
public class AuthorController {

	@Autowired
	private AuthorService authorService;
	
	@PostMapping
	public AuthorDto addAuthor(@RequestBody AuthorDto authorDto) {
		authorService.addAuthor(authorDto);
		return authorDto;
		
	}
}
