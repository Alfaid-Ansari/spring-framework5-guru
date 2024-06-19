package com.example.spring.tutorials.repositories;

import com.example.spring.tutorials.domain.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author,Long> {
}
