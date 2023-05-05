package com.app.authentication.exception;

import com.app.authentication.dto.ErrorResponseDto;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.LinkedHashMap;
import java.util.Map;

@ControllerAdvice
public class ExceptionHandling {

    @ExceptionHandler(UsernameNotFoundException.class)
    public ResponseEntity<ErrorResponseDto<Object>> handlingUsernameNotFound(UsernameNotFoundException e) {
        Map<String, String> errors = new LinkedHashMap<>();
        errors.put("message", e.getMessage());

        ErrorResponseDto<Object> responseBody = ErrorResponseDto.builder()
                .statusCode(HttpServletResponse.SC_NOT_FOUND)
                .errors(errors)
                .build();

        return new ResponseEntity<>(responseBody, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(AuthenticationException.class)
    public ResponseEntity<ErrorResponseDto<Object>> hadlingLoginException(AuthenticationException e) {
        Map<String, Object> data = new LinkedHashMap<>();
        data.put("code", HttpServletResponse.SC_UNAUTHORIZED);
        data.put("error", "Unauthorized");
        data.put("message", e.getMessage());

        ErrorResponseDto<Object> responseBody = ErrorResponseDto.builder()
                .statusCode(HttpServletResponse.SC_UNAUTHORIZED)
                .errors(data)
                .build();

        return new ResponseEntity<>(responseBody, HttpStatus.UNAUTHORIZED);
    }
}
