package com.publication.ms.api;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.publication.ms.api.model.dto.BookDto;
import com.publication.ms.domain.Book;
import com.publication.ms.service.BookService;


@RestController
@RequestMapping(path="/books")
public class BookController {

	@Autowired
	private BookService bookService;
	@Autowired
	private ModelMapper mapper;
	
	@GetMapping
	public BookDto getBooks() {
		Book book = bookService.getBook();
		BookDto bookDto = mapper.map(book, BookDto.class);
		return bookDto;
	}

	@GetMapping(path="/{id}")
	public BookDto getBookById(@PathVariable("id") Integer id) {
		return this.bookService.getBookById(id).map(foundBook -> this.mapper.map(foundBook, BookDto.class))
				
				.orElseThrow(() -> new RuntimeException());
	}
	
	@PostMapping
	public String addBook(@RequestBody BookDto bookDto) {
		Book book = mapper.map(bookDto, Book.class);
		bookService.addBook(book);
		return "Book Created !!";
	}
}
