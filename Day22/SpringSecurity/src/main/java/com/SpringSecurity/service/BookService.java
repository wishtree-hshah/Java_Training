package com.SpringSecurity.service;

import com.SpringSecurity.entity.Book;

import java.util.List;
import java.util.Optional;

public interface BookService {
    public List<Book> getAllBooks();
    public Optional<Book> getBookById(Long id);
    public Book addBook(Book book);
    public String deleteBook(Long id);
}
