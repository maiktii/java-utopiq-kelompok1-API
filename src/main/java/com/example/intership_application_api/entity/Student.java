package com.example.intership_application_api.entity;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public class Student {
    private Long id;
    private String studentName;
    private String studentEmail;
    private String major;
    private int year;

    public Student(Long id,String studentName, String studentEmail, String major, int year){
       this.id = id; this.studentName = studentName; this.studentEmail = studentEmail; this.major = major; this.year = year;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
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
