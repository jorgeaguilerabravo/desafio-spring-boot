package com.nuevospa.tareas.model;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;

@Getter
@Setter
public class AuthenticationRequest {

    @Email(message = "Debe ser un email válido")
    private String email;

    private String password;

}
