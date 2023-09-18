package com.library.services.entity;


import jakarta.persistence.*;

@Table(name = "library_tbl")
@Entity
public class LibraryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String bookName;

    @OneToOne
    @JoinColumn(name = "book_id")
    private BookEntity bookEntity;

    public BookEntity getBookEntity() {
        return bookEntity;
    }

    public void setBookEntity(BookEntity bookEntity) {
        this.bookEntity = bookEntity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public LibraryEntity(Long id, String bookName, BookEntity bookEntity) {
        this.id = id;
        this.bookName = bookName;
        this.bookEntity = bookEntity;
    }

    public LibraryEntity() {
    }
}
