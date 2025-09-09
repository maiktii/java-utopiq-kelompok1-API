package com.example.intership_application_api.dto.application;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApplicationResponse<T> {

    private int statusCode;
    private String message;
    private LocalDateTime timestamp;
    private T result;
}
