package com.example.biblioteca.dto.response;

import java.time.LocalDateTime;

public class UserResponseDTO {

    private Long id;
    private String name;
    private String email;
    private String phone;
    private LocalDateTime registrationDate;
    private Boolean active;

    public UserResponseDTO(Long id, String name, String email, String phone, LocalDateTime registrationDate, Boolean active) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.registrationDate = registrationDate;
        this.active = active;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public LocalDateTime getRegistrationDate() {
        return registrationDate;
    }

    public Boolean getActive() {
        return active;
    }
}
