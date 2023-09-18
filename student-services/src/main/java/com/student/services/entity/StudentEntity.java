package com.student.services.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Student_tbl")
public class StudentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private  String phone;

    @OneToOne
    @JoinColumn(name = "student_id")
    private LibraryEntity libraryEntity;


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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public LibraryEntity getLibraryEntity() {
        return libraryEntity;
    }

    public void setLibraryEntity(LibraryEntity libraryEntity) {
        this.libraryEntity = libraryEntity;
    }

    public StudentEntity(Long id, String name, String email, String phone, LibraryEntity libraryEntity) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.libraryEntity = libraryEntity;
    }

    public StudentEntity() {
    }
}
