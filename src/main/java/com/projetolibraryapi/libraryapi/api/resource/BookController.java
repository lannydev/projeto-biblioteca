package com.projetolibraryapi.libraryapi.api.resource;

import com.projetolibraryapi.libraryapi.api.dto.BookDTO;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/books")
public class BookController {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public BookDTO create(@RequestBody BookDTO dto){
        return dto;

    }
}
