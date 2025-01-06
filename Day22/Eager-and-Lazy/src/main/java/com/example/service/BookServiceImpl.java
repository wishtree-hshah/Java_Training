package com.example.service;

import com.example.entity.Book;
import com.example.entity.Author;
import com.example.repository.BookRepository;
import com.example.repository.AuthorRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private AuthorRepository authorRepository;

    @Override
    public Book getBookById(Long id) {
        return bookRepository.findById(id).orElse(null);
    }

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    @Transactional
    public Book addBook(Book book) {
        // Check if the author exists in the database
        Optional<Author> author = authorRepository.findById(book.getAuthor().getId());

        // If the author doesn't exist, save the author first
        if (!author.isPresent()) {
            System.out.println("Author: " + book.getAuthor().getId());
            authorRepository.save(book.getAuthor()); // Save the author
        } else {
            // If the author exists, update the author's details if necessary
            book.setAuthor(author.get());
        }

        // Save the book
        System.out.println("Book: " + book.getId());
        return bookRepository.save(book);
    }

    @Override
    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
}
