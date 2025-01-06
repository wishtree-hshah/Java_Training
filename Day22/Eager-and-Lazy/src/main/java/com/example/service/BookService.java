package com.example.service;

import com.example.entity.Book;
import java.util.List;

public interface BookService {

    Book getBookById(Long id);

    List<Book> getAllBooks();

    Book addBook(Book book);

    void deleteBook(Long id);
}

