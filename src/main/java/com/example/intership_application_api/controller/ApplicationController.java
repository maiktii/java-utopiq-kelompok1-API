package com.example.intership_application_api.controller;

import com.example.intership_application_api.dto.application.ApplicationRequest;
import com.example.intership_application_api.entity.Application;
import com.example.intership_application_api.repository.ApplicationRepository;
import com.example.intership_application_api.service.ApplicationService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApplicationController {

    @Autowired
    private final ApplicationService applicationService;

    @PostMapping("/applications")
    public ResponseEntity<Application> CreateApplication(@Valid @RequestBody ApplicationRequest applicationRequest){
        return applicationService.CreateApplication(applicationRequest);
    }
}
