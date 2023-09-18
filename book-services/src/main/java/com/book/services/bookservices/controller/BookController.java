package com.book.services.bookservices.controller;


import com.book.services.bookservices.entity.BookEntity;
import com.book.services.bookservices.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/book")
@CrossOrigin("*")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping("create")
    public ResponseEntity<BookEntity> createBook(@RequestBody BookEntity bookEntity) {
        BookEntity newBook = bookService.createBook(bookEntity);
        return ResponseEntity.ok(newBook);
    }

    @GetMapping("{id}")
    public ResponseEntity<BookEntity> getById(@PathVariable Long id) {
        BookEntity newBook = bookService.getBook(id);
        return new ResponseEntity<>(newBook, HttpStatus.OK);
    }


}
