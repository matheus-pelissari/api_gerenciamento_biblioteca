package com.example.biblioteca.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;

public class BookRequestDTO {

    @NotBlank(message = "O título é obrigatório")
    @Size(max = 256, message = "Titulo máximo 256 caracteres")
    private String titulo;

    @NotBlank(message = "O autor é obrigatório")
    @Size(max = 128, message = "Authot máximo de 128 caracteres")
    private String author;

    @NotBlank(message = "O isbn é obrigatório")
    @Size(max = 100, message = "Isbn máximo de 100 caracteres")
    private String isbn;

    @Size(max = 128, message = "Publiser máximo de 128 caracteres")
    private String publisher;

    private Integer publicationYear;

    @NotBlank(message = "O totalCopies é obrigatório")
    @PositiveOrZero(message = "O totalCopies não pode ser negativo")
    private Integer totalCopies;

    @Size(max = 128, message = "Category máximo de 128 caracteres")
    private String category;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Integer getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(Integer publicationYear) {
        this.publicationYear = publicationYear;
    }

    public Integer getTotalCopies() {
        return totalCopies;
    }

    public void setTotalCopies(Integer totalCopies) {
        this.totalCopies = totalCopies;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
