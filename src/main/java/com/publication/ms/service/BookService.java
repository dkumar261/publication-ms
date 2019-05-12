package com.publication.ms.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.publication.ms.domain.Book;
import com.publication.ms.repository.BookRepository;

@Service
public class BookService {

	@Autowired
	private BookRepository bookRepository;
	
	public Book getBook() {
		Book book = bookRepository.getOne(1);
		return book;
	}

	public void addBook(Book book) {

		bookRepository.save(book);
	}

	public Optional<Book> getBookById(Integer id) {
		
		return bookRepository.findById(id);
	}
}
