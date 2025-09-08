package com.example.intership_application_api.service;

import com.example.intership_application_api.dto.application.ApplicationRequest;
import com.example.intership_application_api.entity.Application;
import com.example.intership_application_api.repository.ApplicationRepository;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicationService {

    private final ApplicationRepository applicationRepository;

    public ApplicationService(ApplicationRepository applicationRepository) {
        this.applicationRepository = applicationRepository;
    }

    public ResponseEntity<Application> CreateApplication(ApplicationRequest applicationRequest){
        Application dataApplication = applicationRepository.saveApplication(
                new Application(null, applicationRequest.getStudentId(), applicationRequest.getCompanyId(),
                        applicationRequest.getPosition(), applicationRequest.getResumeURL(), applicationRequest.getStatus())
        );
        return ResponseEntity.status(HttpStatus.CREATED).body(dataApplication);
    }

    public ResponseEntity<List<Application>> getAllApplications() {
        List<Application> list = applicationRepository.findAllApplication();
        return ResponseEntity.ok(list);
    }

    public ResponseEntity<Application> getApplicationById(Long id) {
        return applicationRepository.findByApplicationId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }

    public ResponseEntity<HttpStatus> deleteApplicationById(Long id){
        if (!applicationRepository.applicationExists(id)){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
        applicationRepository.deleteApplication(id);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    public ResponseEntity<Application> updateApplicationById(Long id, ApplicationRequest applicationRequest){
        if (!applicationRepository.applicationExists(id)){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
        if (!applicationRequest.getStatus().equals("PENDING") && !applicationRequest.getStatus().equals("ACCEPTED")
        && !applicationRequest.getStatus().equals("REJECTED")){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
        applicationRequest.setStatus(applicationRequest.getStatus());
        return ResponseEntity.ok(applicationRepository.saveApplication(new Application(null,
                        applicationRequest.getStudentId(),
                        applicationRequest.getCompanyId(),
                        applicationRequest.getStatus(),
                        applicationRequest.getPosition(),
                        applicationRequest.getResumeURL())));
    }
}
