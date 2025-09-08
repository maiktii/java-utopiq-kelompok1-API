package com.example.intership_application_api.entity;

import jakarta.validation.constraints.NotBlank;

public class Application {

    private Long id;

    private int studentId;
    private int companyId;

    @NotBlank
    private String position;

    @NotBlank
    private String resumeURL;


    public Application(Long id, int studentId, int companyId, String position, String resumeURL){
        this.id = id; this.studentId = studentId; this.companyId = companyId;
        this.position = position; this.resumeURL = resumeURL;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setResumeURL(String resumeURL) {
        this.resumeURL = resumeURL;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getCompanyId() {
        return companyId;
    }

    public String getPosition() {
        return position;
    }

    public String getResumeURL() {
        return resumeURL;
    }
}
