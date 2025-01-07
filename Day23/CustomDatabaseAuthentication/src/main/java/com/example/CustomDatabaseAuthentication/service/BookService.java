package com.example.CustomDatabaseAuthentication.service;

import com.example.CustomDatabaseAuthentication.entity.Book;
import com.example.CustomDatabaseAuthentication.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * The type Book service.
 */
@Service
public class BookService {

    private final BookRepository bookRepository;

    /**
     * Instantiates a new Book service.
     *
     * @param bookRepository the book repository
     */
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    /**
     * Save book book.
     *
     * @param book the book
     * @return the book
     */
    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }

    /**
     * Delete book.
     *
     * @param id the id
     */
    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }

    /**
     * Gets all books.
     *
     * @return the all books
     */
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }
}

