package com.projetolibraryapi.libraryapi.api.dto;


import lombok.*;

@Getter
@Setter
@Builder // faz com que o Lombok gere um builder para classe, facilita a criação das instancias
@NoArgsConstructor
@AllArgsConstructor
public class BookDTO {

    private Long id;
    private String title;
    private String author;
    private String isbn;

}
