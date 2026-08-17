package com.example.biblioteca.model;

import com.example.biblioteca.enums.BookStatus;
import jakarta.persistence.*;

import java.time.LocalDateTime;


@Entity
@Table(name = "book")

public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 256)
    private String title;

    @Column(nullable = false, length = 128)
    private String author;

    @Column(nullable = false, unique = true, length = 100)
    private String isbn;

    @Column(length = 128)
    private String publisher;

    private Integer publicationYear;

    @Column(nullable = false)
    private Integer totalCopies;

    @Column(nullable = false)
    private Integer availableCopies;

    @Column(length = 128)
    private String category;

    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 20)
    private BookStatus status;

    // Roda uma única vez, antes de ocorrer um Insert.
    // Ocorre quando chama um save() passando uma entidade nova.
    // O Hibernate chama automaticamento o onCreate.
    @PrePersist
    protected void onCreate(){
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
        if(this.status == null){
            this.status = BookStatus.ACTIVE;
        }
    }

    // Roda toda vez que uma entidade já existente sofre alguma alteração e é sincronizada via UPDATE
    @PreUpdate
    protected void onUpdate(){
        this.updatedAt = LocalDateTime.now();
    }


    public Book(){}

    public Book(Long id, String title, String author, String isbn, String publisher, Integer publicationYear, Integer totalCopies, Integer availableCopies, String category, LocalDateTime createdAt, LocalDateTime updatedAt, BookStatus status) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.publisher = publisher;
        this.publicationYear = publicationYear;
        this.totalCopies = totalCopies;
        this.availableCopies = availableCopies;
        this.category = category;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.status = status;
    }
}
