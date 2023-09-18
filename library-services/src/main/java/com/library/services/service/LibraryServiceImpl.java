package com.library.services.service;

import com.library.services.entity.BookEntity;
import com.library.services.entity.LibraryEntity;
import com.library.services.repository.LibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LibraryServiceImpl implements LibraryService{

    @Autowired
    private LibraryRepository libraryRepository;

    @Override
    public LibraryEntity createLib(LibraryEntity libraryEntity) {

        return libraryRepository.save(libraryEntity);
    }

    @Override
    public LibraryEntity getBook(Long id) {
        Optional<LibraryEntity> newBook = libraryRepository.findById(id);
        return  newBook.get();
    }
}
