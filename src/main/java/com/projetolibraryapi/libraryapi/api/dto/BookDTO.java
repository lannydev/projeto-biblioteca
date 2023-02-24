package com.projetolibraryapi.libraryapi.api.dto;


import lombok.*;

import javax.validation.constraints.NotEmpty;

@Getter
@Setter
@Builder // faz com que o Lombok gere um builder para classe, facilita a criação das instancias
@NoArgsConstructor
@AllArgsConstructor
public class BookDTO {

    private Long id;

    @NotEmpty
    private String title;
    @NotEmpty
    private String author;
    @NotEmpty
    private String isbn;

}
