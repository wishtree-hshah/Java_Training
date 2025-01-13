package com.oauth.repository;

import com.oauth.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * The interface Book repository.
 */
public interface BookRepository extends JpaRepository<Book, Long> {
}