package com.library.services.controller;

import com.library.services.entity.BookEntity;
import com.library.services.entity.LibraryEntity;
import com.library.services.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("api/v1/library")
@CrossOrigin("*")
public class LibraryController {

    @Autowired
    private LibraryService libraryService;

    @Autowired
    private RestTemplate restTemplate;


    @GetMapping("{id}")
    public ResponseEntity<LibraryEntity> getById(@PathVariable Long id){
        BookEntity book = restTemplate.getForObject("http://localhost:8082/api/v1/book/" + id, BookEntity.class);
        LibraryEntity newLib = libraryService.getBook(id);
        newLib.setBookEntity(book);
        return new ResponseEntity<>(newLib, HttpStatus.OK);
    }

    @PostMapping("create")
    public ResponseEntity<LibraryEntity> createLib(@RequestBody LibraryEntity libraryEntity){
        LibraryEntity createLib = libraryService.createLib(libraryEntity);
        return new ResponseEntity<>(createLib, HttpStatus.CREATED);
    }


}
