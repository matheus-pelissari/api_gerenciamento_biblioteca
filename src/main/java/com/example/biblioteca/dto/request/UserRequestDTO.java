package com.example.biblioteca.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class UserRequestDTO {

    @NotBlank(message = "O name é obrigatório")
    @Size(max = 256, message = "Name máximo de 256 caracteres")
    private String name;

    @NotBlank(message = "O email é obrigatório")
    @Size(max = 256, message = "Email máximo de 256 caracteres")
    @Email(message = "Email deve ter um formato válido")
    private String email;

    @NotBlank(message = "O cpf é obrigatório")
    @Size(min = 11, max = 11, message = "Cpf máximo de 11 caracteres")
    private String cpf;

    @Size(max = 11, message = "Phone máximo de 11 caracteres")
    private String phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
