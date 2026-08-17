package com.example.biblioteca.dto.response;

import com.example.biblioteca.enums.LoanStatus;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class LoanResponseDTO {

    private Long id;
    private String bookTitle;
    private String userName;
    private LocalDateTime loanDate;
    private LocalDate dueDate;
    private LocalDate returnDate;
    private LoanStatus status;

    public LoanResponseDTO(Long id, String bookTitle, String userName, LocalDateTime loanDate, LocalDate dueDate, LocalDate returnDate, LoanStatus status) {
        this.id = id;
        this.bookTitle = bookTitle;
        this.userName = userName;
        this.loanDate = loanDate;
        this.dueDate = dueDate;
        this.returnDate = returnDate;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getUserName() {
        return userName;
    }

    public LocalDateTime getLoanDate() {
        return loanDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public LoanStatus getStatus() {
        return status;
    }
}
