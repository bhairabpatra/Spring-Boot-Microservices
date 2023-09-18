package com.book.services.bookservices.service;

import com.book.services.bookservices.entity.BookEntity;
import com.book.services.bookservices.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public BookEntity createBook(BookEntity bookEntity) {
        return bookRepository.save(bookEntity);
    }

    @Override
    public BookEntity getBook(Long id) {
        Optional<BookEntity> newBook = bookRepository.findById(id);
        return newBook.get();
    }
}
