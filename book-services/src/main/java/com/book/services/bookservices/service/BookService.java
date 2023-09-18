package com.book.services.bookservices.service;

import com.book.services.bookservices.entity.BookEntity;

public interface BookService {

    BookEntity createBook(BookEntity bookEntity);

    BookEntity getBook(Long id);
}
