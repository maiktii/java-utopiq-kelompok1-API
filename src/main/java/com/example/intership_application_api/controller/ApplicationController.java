package com.example.intership_application_api.controller;

import com.example.intership_application_api.dto.application.ApplicationRequest;
import com.example.intership_application_api.entity.Application;
import com.example.intership_application_api.repository.ApplicationRepository;
import com.example.intership_application_api.service.ApplicationService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ApplicationController {

    private final ApplicationService applicationService;

    public ApplicationController(ApplicationService applicationService) {
        this.applicationService = applicationService;
    }

    @PostMapping("/applications")
    public ResponseEntity<Application> CreateApplication(@Valid @RequestBody ApplicationRequest applicationRequest){
        return applicationService.CreateApplication(applicationRequest);
    }

    @GetMapping("/applications")
    public ResponseEntity<List<Application>> getApplications() {
        return applicationService.getAllApplications();
    }

    @GetMapping("/applications/{id}")
    public ResponseEntity<Application> getApplicationById(@PathVariable Long id) {
        return applicationService.getApplicationById(id);
    }

    @DeleteMapping("/applications/{id}")
    public ResponseEntity<HttpStatus> deleteApplicationById(@PathVariable("id") Long id){
        return applicationService.deleteApplicationById(id);
    }

    @PutMapping("/applications/{id}")
    public ResponseEntity<Application> updateApplicationStatus(
            @PathVariable("id") Long id, @Valid @RequestBody ApplicationRequest applicationRequest){
        return applicationService.updateApplicationById(id, applicationRequest);
    }
}
