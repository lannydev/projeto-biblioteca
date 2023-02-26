package com.projetolibraryapi.libraryapi.model.repository;

import com.projetolibraryapi.libraryapi.model.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
    boolean existsByIsbn(String isbn);
}

