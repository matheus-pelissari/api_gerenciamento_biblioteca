package com.example.biblioteca.dto.request;

import jakarta.validation.constraints.NotBlank;

public class LoanRequestDTO {

    @NotBlank(message = "O id do usuário é obrigatório")
    private Long userId;

    @NotBlank(message = "O id do livro é obrigatório")
    private Long bookId;

    public LoanRequestDTO(){}

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public Long getUserId() {
        return userId;
    }

    public Long getBookId() {
        return bookId;
    }
}
