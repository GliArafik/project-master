package com.app.authentication.dto;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
// @JsonPropertyOrder({"status_code", "message", "data"})
public class SuccessResponseDto<T> {

    // @JsonProperty("status_code")
    private Integer statusCode;

    private String message;

    private T data;
}
