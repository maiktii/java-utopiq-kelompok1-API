package com.example.intership_application_api.service;

import com.example.intership_application_api.dto.application.ApplicationRequest;
import com.example.intership_application_api.entity.Application;
import com.example.intership_application_api.entity.Student;
import com.example.intership_application_api.repository.ApplicationRepository;
import com.example.intership_application_api.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ApplicationService {

    private final ApplicationRepository applicationRepository;
    private final StudentRepository studentRepository;

    public ApplicationService(ApplicationRepository applicationRepository, StudentRepository studentRepository) {
        this.applicationRepository = applicationRepository;
        this.studentRepository = studentRepository;
    }

    public Application CreateApplicationByStudentId(Long id, ApplicationRequest applicationRequest){
        Student dataStudent = studentRepository.findById(id).orElse(null);
        Application dataApplication =  applicationRepository.save(
                new Application(null, dataStudent, applicationRequest.getCompanyId(),
                        applicationRequest.getPosition(), applicationRequest.getResumeURL(), applicationRequest.getStatus())
        );
        return dataApplication;
    }

    public List<Application> getAllApplications(){
        List<Application> dataApplications = applicationRepository.findAll();
        return dataApplications;
    }

    public Optional<Application> getAllApplicationById(Long id){
        Optional<Application> result = applicationRepository.findById(id);
        return result;
    }



//    public ResponseEntity<Application> getApplicationById(Long id) {
//        return applicationRepository.findByApplicationId(id)
//                .map(ResponseEntity::ok)
//                .orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
//    }
//
//    public ResponseEntity<HttpStatus> deleteApplicationById(Long id){
//        if (!applicationRepository.applicationExists(id)){
//            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
//        }
//        applicationRepository.deleteApplication(id);
//        return ResponseEntity.ok(HttpStatus.OK);
//    }
//
//    public ResponseEntity<Application> updateApplicationById(Long id, ApplicationRequest applicationRequest){
//        if (!applicationRepository.applicationExists(id)){
//            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
//        }
//        if (!applicationRequest.getStatus().equals("PENDING") && !applicationRequest.getStatus().equals("ACCEPTED")
//        && !applicationRequest.getStatus().equals("REJECTED")){
//            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
//        }
//        applicationRequest.setStatus(applicationRequest.getStatus());
//        return ResponseEntity.ok(applicationRepository.saveApplication(new Application(null,
//                        applicationRequest.getStudentId(),
//                        applicationRequest.getCompanyId(),
//                        applicationRequest.getStatus(),
//                        applicationRequest.getPosition(),
//                        applicationRequest.getResumeURL())));
//    }
}
