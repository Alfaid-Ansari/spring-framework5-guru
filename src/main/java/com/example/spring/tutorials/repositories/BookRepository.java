package com.example.spring.tutorials.repositories;

import com.example.spring.tutorials.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Long> {
}
