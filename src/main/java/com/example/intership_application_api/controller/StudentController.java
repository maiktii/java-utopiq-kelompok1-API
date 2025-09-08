package com.example.intership_application_api.controller;

import com.example.intership_application_api.dto.student.StudentRequest;
import com.example.intership_application_api.entity.Application;
import com.example.intership_application_api.entity.Student;
import com.example.intership_application_api.repository.StudentRepository;
import com.example.intership_application_api.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/students")
    public ResponseEntity<Student> CreateStudent(@Valid @RequestBody StudentRequest studentRequest){
        return studentService.CreateStudent(studentRequest);
    }

    @GetMapping("/students/{id}/applications")
    public ResponseEntity<Application> CheckApplicationByStudentId(@PathVariable("id") Long id){
        return studentService.CheckStudentApplication(id);
    }
}
