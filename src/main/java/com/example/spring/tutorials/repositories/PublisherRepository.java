package com.example.spring.tutorials.repositories;

import com.example.spring.tutorials.domain.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublisherRepository extends JpaRepository<Publisher,Long> {
}
