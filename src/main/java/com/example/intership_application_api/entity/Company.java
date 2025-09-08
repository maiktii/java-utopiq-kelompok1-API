package com.example.intership_application_api.entity;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public class Company {
    private Long id;
    private String companyName;
    private String companyAddress;
    private String companyIndustry;
    private String companyEmail;
    private String companyPhone;

    public Company(Long id, String companyName, String companyAddress, String companyIndustry, String companyEmail,
                          String companyPhone){
        this.id = id;this.companyName = companyName; this.companyAddress = companyAddress;
        this.companyIndustry = companyIndustry;this.companyEmail = companyEmail; this.companyPhone = companyPhone;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyIndustry(String companyIndustry) {
        this.companyIndustry = companyIndustry;
    }

    public String getCompanyIndustry() {
        return companyIndustry;
    }

    public void setCompanyEmail(String companyEmail) {
        this.companyEmail = companyEmail;
    }

    public String getCompanyEmail() {
        return companyEmail;
    }

    public void setCompanyPhone(String companyPhone) {
        this.companyPhone = companyPhone;
    }

    public String getCompanyPhone() {
        return companyPhone;
    }
}
