package com.student.services.entity;
import jakarta.persistence.*;

@Table(name = "book_tbl")
@Entity
public class BookEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String price;
    private String author;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public BookEntity(Long id, String name, String price, String author) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.author = author;
    }

    public BookEntity() {
    }
}
