package com.example.intership_application_api.dto.student;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

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

    public StudentRequest(String studentName, String studentEmail, String major, int year){
        this.studentName = studentName; this.studentEmail = studentEmail; this.major = major; this.year = year;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public String getMajor() {
        return major;
    }

    public int getYear() {
        return year;
    }
}
