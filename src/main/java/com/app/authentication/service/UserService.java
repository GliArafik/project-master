package com.app.authentication.service;

import com.app.authentication.dto.LoginRequestDto;
import com.app.authentication.dto.RegisterRequestDto;
import com.app.authentication.dto.SuccessResponseDto;
import com.app.authentication.model.User;
import org.springframework.http.ResponseEntity;

public interface UserService {

    String authenticate(LoginRequestDto loginRequestDto);

    ResponseEntity<SuccessResponseDto<?>> register(RegisterRequestDto registerRequestDto);

    User saveUser(User user);

}
