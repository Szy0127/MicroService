package com.web.bookauthor.repository;

import com.web.bookauthor.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface BookRepository extends JpaRepository<Book,Integer> {

    List<Book> getBooksByName(String name);
}
