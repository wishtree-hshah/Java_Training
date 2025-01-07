package com.SpringSecurity.service;

import com.SpringSecurity.entity.Book;

import java.util.List;
import java.util.Optional;

/**
 * The interface Book service.
 */
public interface BookService {
    /**
     * Gets all books.
     *
     * @return the all books
     */
    public List<Book> getAllBooks();

    /**
     * Gets book by id.
     *
     * @param id the id
     * @return the book by id
     */
    public Optional<Book> getBookById(Long id);

    /**
     * Add book book.
     *
     * @param book the book
     * @return the book
     */
    public Book addBook(Book book);

    /**
     * Delete book string.
     *
     * @param id the id
     * @return the string
     */
    public String deleteBook(Long id);
}
