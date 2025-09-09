package com.example.intership_application_api.controller;

import com.example.intership_application_api.dto.application.ApplicationRequest;
import com.example.intership_application_api.dto.application.ApplicationResponse;
import com.example.intership_application_api.entity.Application;
import com.example.intership_application_api.service.ApplicationService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class ApplicationController {

    private final ApplicationService applicationService;

    public ApplicationController(ApplicationService applicationService) {
        this.applicationService = applicationService;
    }

    @PostMapping("/applications")
    public Application CreateApplicationByStudentId(@RequestBody Long id, @RequestBody ApplicationRequest applicationRequest){
        return applicationService.CreateApplicationByStudentId(id, applicationRequest);
    }

    @GetMapping("/applications")
    public List<Application> getAllApplications(){
        return applicationService.getAllApplications();
    }

    @GetMapping("/application/{id}")
    public Application getAllApplicationById(@PathVariable Long id){
        Optional<Application> result = applicationService.getAllApplicationById(id);
        return result.get();
    }


//    @PostMapping("/applications")
//    public ResponseEntity<Application> CreateApplication(@Valid @RequestBody ApplicationRequest applicationRequest){
//        return applicationService.CreateApplication(applicationRequest);
//    }
//
//    @GetMapping("/applications")
//    public ResponseEntity<List<Application>> getApplications() {
//        return applicationService.getAllApplications();
//    }
//
//    @GetMapping("/applications/{id}")
//    public ResponseEntity<Application> getApplicationById(@PathVariable Long id) {
//        return applicationService.getApplicationById(id);
//    }
//
//    @DeleteMapping("/applications/{id}")
//    public ResponseEntity<HttpStatus> deleteApplicationById(@PathVariable("id") Long id){
//        return applicationService.deleteApplicationById(id);
//    }
//
//    @PutMapping("/applications/{id}")
//    public ResponseEntity<Application> updateApplicationStatus(
//            @PathVariable("id") Long id, @Valid @RequestBody ApplicationRequest applicationRequest){
//        return applicationService.updateApplicationById(id, applicationRequest);
//    }
//
//    @GetMapping("/applications/all")
//    public ResponseEntity<ApplicationResponse<List<Application>>> getAllApplicationWithJSON(){
////        return applicationService.getAllApplicationWithStructure();
//    }
}
