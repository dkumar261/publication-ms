package com.publication.ms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.publication.ms.domain.Author;

public interface AuthorRespository extends JpaRepository<Author, Integer> {

}
