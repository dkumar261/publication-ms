package com.publication.ms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.publication.ms.domain.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
