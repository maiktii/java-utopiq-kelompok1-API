package com.example.intership_application_api.service;

import com.example.intership_application_api.dto.company.CompanyRequest;
import com.example.intership_application_api.entity.Company;
import com.example.intership_application_api.repository.CompanyRepository;
import org.springframework.stereotype.Service;

@Service
public class CompanyService {
    private final CompanyRepository repo;

    public CompanyService(CompanyRepository repo) {
        this.repo = repo;
    }

    public Company create(CompanyRequest req) {
        Company c = new Company(
                null,
                req.getCompanyName(),
                req.getCompanyAddress(),
                req.getCompanyIndustry(),
                req.getCompanyEmail(),
                req.getCompanyPhone()
        );
        return repo.save(c);
    }

    public Iterable<Company> getAll() {
        return repo.findAll();
    }

}
