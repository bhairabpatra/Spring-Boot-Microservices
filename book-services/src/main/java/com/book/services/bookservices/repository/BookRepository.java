package com.book.services.bookservices.repository;

import com.book.services.bookservices.entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<BookEntity, Long> {
}
