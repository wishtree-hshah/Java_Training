package com.SpringSecurity.respository;

import com.SpringSecurity.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * The interface Book repository.
 */
public interface BookRepository extends JpaRepository<Book, Long> {
}