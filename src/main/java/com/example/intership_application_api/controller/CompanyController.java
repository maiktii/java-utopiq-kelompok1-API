package com.example.intership_application_api.controller;

import com.example.intership_application_api.dto.company.CompanyRequest;
import com.example.intership_application_api.entity.Company;
import com.example.intership_application_api.service.CompanyService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/companies")
public class CompanyController {

    private final CompanyService service;

    public CompanyController(CompanyService service) {
        this.service = service;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Company create(@Valid @RequestBody CompanyRequest request) {
        return service.create(request);
    }

    // bonus GET biar bisa lihat data yang sudah disimpan
    @GetMapping
    public Iterable<Company> getAll() {
        return service.getAll();
    }
}
