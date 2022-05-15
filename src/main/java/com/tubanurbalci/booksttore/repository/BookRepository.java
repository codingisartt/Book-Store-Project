package com.tubanurbalci.booksttore.repository;

import com.tubanurbalci.booksttore.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Integer> {
}
