package com.library.services.service;

import com.library.services.entity.LibraryEntity;

public interface LibraryService {

    LibraryEntity createLib(LibraryEntity libraryEntity);

    LibraryEntity getBook(Long id);
}
