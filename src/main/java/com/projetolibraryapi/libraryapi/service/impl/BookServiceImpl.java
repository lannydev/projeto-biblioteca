package com.projetolibraryapi.libraryapi.service.impl;

import com.projetolibraryapi.libraryapi.model.entity.Book;
import com.projetolibraryapi.libraryapi.model.repository.BookRepository;
import com.projetolibraryapi.libraryapi.service.BookService;
import org.springframework.stereotype.Service;


@Service
public class BookServiceImpl implements BookService {

    private BookRepository repository;

    public BookServiceImpl(BookRepository repository) {
        this.repository = repository;
    }

    @Override
    public Book save(Book book) {
        return repository.save(book);
    }
}
