package com.example.CustomDatabaseAuthentication.repository;

import com.example.CustomDatabaseAuthentication.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * The interface Book repository.
 */
public interface BookRepository extends JpaRepository<Book, Long> {
}

