package com.example.intership_application_api.service;

import com.example.intership_application_api.dto.student.StudentRequest;
import com.example.intership_application_api.entity.Application;
import com.example.intership_application_api.entity.Student;
import com.example.intership_application_api.repository.ApplicationRepository;
import com.example.intership_application_api.repository.StudentRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    private final StudentRepository studentRepository;
    private final ApplicationRepository applicationRepository;

    public StudentService(StudentRepository studentRepository, ApplicationRepository applicationRepository) {
        this.studentRepository = studentRepository;
        this.applicationRepository = applicationRepository;
    }

    public Student createStudent(StudentRequest studentRequest){
        Student student = studentRepository.save(new Student(null, studentRequest.getStudentName(),
                studentRequest.getStudentEmail(), studentRequest.getMajor(), studentRequest.getYear(), null));
        return student;
    }

    public List<Student> getAllStudent(){
        List<Student> student = studentRepository.findAll();
        return student;
    }

    public Optional<Student> getAllStudentById(long id){
        Optional<Student> studentById = studentRepository.findById(id);
        return studentById;
    }

//    public ResponseEntity<Student> CreateStudent(StudentRequest studentRequest){
//        Student savedStudent = studentRepository.save(new Student(null, studentRequest.getStudentName(), studentRequest.getStudentEmail(),
//                studentRequest.getMajor(), studentRequest.getYear()));
//        return ResponseEntity.status(HttpStatus.CREATED).body(savedStudent);
//    }
//
//    public ResponseEntity<Application> CheckStudentApplication(Long id){
//        Application applicationDataByStudentId = null;
//        List<Application> applicationData = applicationRepository.findAllApplication();
//
//        for (Application application : applicationData){
//            if (id == application.getStudentId()){
//                applicationDataByStudentId = applicationRepository.findByApplicationId((long)id).orElse(null);
//            }
//        }
//
//        return ResponseEntity.status(HttpStatus.OK).body(applicationDataByStudentId);
//    }
}
