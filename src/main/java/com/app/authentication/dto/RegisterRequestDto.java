package com.app.authentication.dto;

import lombok.Data;

@Data
public class RegisterRequestDto {

    private String username;

    private String firstName;

    private String lastName;

    private String password;

}
