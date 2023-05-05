package com.app.authentication.dto;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
// @JsonPropertyOrder({"status_code", "errors"})
public class ErrorResponseDto<T> {

    // @JsonProperty("status_code")
    private Integer statusCode;

    private T errors;
}
