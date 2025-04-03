package com.rabiiFirst.infoSysProj.utils;


import jakarta.annotation.*;
import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.validation.annotation.Validated;

public class RegistrationRequest {
    private String firstname;
    private String lastname;
    private String role;
    private String password;
    private String email;

    // getters

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getRole() {
        return role;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }
}
