package com.example.intership_application_api.dto.company;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public class CompanyRequest {
    @NotBlank
    private String companyName;

    @NotBlank
    private String companyAddress;

    @NotBlank
    private String companyIndustry;

    @NotBlank
    @Email
    private String companyEmail;

    @NotBlank
    private String companyPhone;

    public CompanyRequest() {}
    public CompanyRequest(String companyName, String companyAddress, String companyIndustry, String companyEmail,
                          String companyPhone){
        this.companyName = companyName; this.companyAddress = companyAddress; this.companyIndustry = companyIndustry;
        this.companyEmail = companyEmail; this.companyPhone = companyPhone;
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
