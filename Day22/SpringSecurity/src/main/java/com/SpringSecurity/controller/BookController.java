package com.SpringSecurity.controller;

import com.SpringSecurity.entity.Book;
import com.SpringSecurity.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class BookController {
    @Autowired
    BookService bookService;

    @PostMapping("/book")
    public ResponseEntity<?> addBook(@RequestBody Book book){
        return new ResponseEntity<>(bookService.addBook(book), HttpStatus.CREATED);
    }

    @GetMapping("/book/{id}")
    public ResponseEntity<?> getBookById(@PathVariable long id){
        return new ResponseEntity<>(bookService.getBookById(id),HttpStatus.OK);
    }

    @GetMapping("/book")
    public ResponseEntity<?> getBooks(){
        return new ResponseEntity<>(bookService.getAllBooks(),HttpStatus.OK);
    }

    @DeleteMapping("/book/{id}")
    public ResponseEntity<?> deleteBook(@PathVariable long id){
        return new ResponseEntity<>(bookService.deleteBook(id),HttpStatus.OK);
    }
}
