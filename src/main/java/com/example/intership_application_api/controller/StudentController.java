package com.example.intership_application_api.controller;

import com.example.intership_application_api.dto.student.StudentRequest;
import com.example.intership_application_api.entity.Student;
import com.example.intership_application_api.repository.StudentRepository;
import com.example.intership_application_api.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class StudentController {

    @Autowired
    private final StudentService studentService;

    @PostMapping("/students")
    public ResponseEntity<Student> CreateStudent(@Valid @RequestBody StudentRequest studentRequest){
        return studentService.CreateStudent(studentRequest);
    }
}
