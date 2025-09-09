package com.example.intership_application_api.dto.application;

import java.time.LocalDateTime;

public class ApplicationResponse<T> {

    private int statusCode;
    private String message;
    private LocalDateTime timestamp;
    private T result;

    public ApplicationResponse(int statusCode, String message, LocalDateTime timestamp, T result){
        this.statusCode = statusCode; this.message = message; this.timestamp = timestamp; this.result = result;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public T getResult() {
        return result;
    }
}
