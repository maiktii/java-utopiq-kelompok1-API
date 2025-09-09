package com.example.intership_application_api.dto.application;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApplicationRequest {

    private int studentId;
    private int companyId;

    @NotBlank
    private String position;

    @NotBlank
    private String resumeURL;

    @NotBlank
    private String status;
}

