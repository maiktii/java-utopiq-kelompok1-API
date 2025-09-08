package com.example.intership_application_api.service;

import com.example.intership_application_api.dto.student.StudentRequest;
import com.example.intership_application_api.entity.Student;
import com.example.intership_application_api.repository.StudentRepository;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public ResponseEntity<Student> CreateStudent(StudentRequest studentRequest){
        Student savedStudent = studentRepository.save(new Student(null, studentRequest.getStudentName(), studentRequest.getStudentEmail(),
                studentRequest.getMajor(), studentRequest.getYear()));
        return ResponseEntity.status(HttpStatus.CREATED).body(savedStudent);
    }
}
