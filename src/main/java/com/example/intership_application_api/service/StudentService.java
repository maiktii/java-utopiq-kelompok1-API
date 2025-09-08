package com.example.intership_application_api.service;

import com.example.intership_application_api.dto.student.StudentRequest;
import com.example.intership_application_api.entity.Student;
import com.example.intership_application_api.repository.StudentRepository;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

public class StudentService {
    @Autowired
    private final StudentRepository studentRepository;

    public ResponseEntity<Student> CreateStudent(StudentRequest studentRequest){
        Student savedStudent = studentRepository.save(new Student(null, studentRequest.getStudentName(), studentRequest.getStudentEmail(),
                studentRequest.getMajor(), studentRequest.getYear()));
        return ResponseEntity.status(HttpStatus.CREATED).body(savedStudent);
    }
}
