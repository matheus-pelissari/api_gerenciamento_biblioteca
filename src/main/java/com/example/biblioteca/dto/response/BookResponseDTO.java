package com.example.biblioteca.dto.response;

import com.example.biblioteca.enums.BookStatus;

import java.time.LocalDateTime;

public class BookResponseDTO {

    private Long id;
    private String title;
    private String author;
    private String isbn;
    private String publisher;
    private Integer publicationYear;
    private Integer totalCopies;
    private Integer availableCopies;
    private String category;
    private BookStatus status;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}
