package com.example.intership_application_api.dto.student;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentRequest {
    @NotBlank
    private String studentName;

    @NotBlank
    @Email
    private String studentEmail;

    @NotBlank
    private String major;

    @Min(1990)
    @Max(2023)
    private int year;
}
