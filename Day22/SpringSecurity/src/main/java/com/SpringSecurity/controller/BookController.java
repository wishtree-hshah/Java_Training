package com.SpringSecurity.controller;

import com.SpringSecurity.entity.Book;
import com.SpringSecurity.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * The type Book controller.
 */
@RestController
@RequestMapping("/api")
public class BookController {
    /**
     * The Book service.
     */
    @Autowired
    BookService bookService;

    /**
     * Add book response entity.
     *
     * @param book the book
     * @return the response entity
     */
    @PostMapping("/book")
    public ResponseEntity<?> addBook(@RequestBody Book book){
        return new ResponseEntity<>(bookService.addBook(book), HttpStatus.CREATED);
    }

    /**
     * Get book by id response entity.
     *
     * @param id the id
     * @return the response entity
     */
    @GetMapping("/book/{id}")
    public ResponseEntity<?> getBookById(@PathVariable long id){
        return new ResponseEntity<>(bookService.getBookById(id),HttpStatus.OK);
    }

    /**
     * Get books response entity.
     *
     * @return the response entity
     */
    @GetMapping("/book")
    public ResponseEntity<?> getBooks(){
        return new ResponseEntity<>(bookService.getAllBooks(),HttpStatus.OK);
    }

    /**
     * Delete book response entity.
     *
     * @param id the id
     * @return the response entity
     */
    @DeleteMapping("/book/{id}")
    public ResponseEntity<?> deleteBook(@PathVariable long id){
        return new ResponseEntity<>(bookService.deleteBook(id),HttpStatus.OK);
    }
}
