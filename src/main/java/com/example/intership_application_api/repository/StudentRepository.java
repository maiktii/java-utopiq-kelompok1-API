package com.example.intership_application_api.repository;

import com.example.intership_application_api.dto.student.StudentRequest;
import com.example.intership_application_api.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public interface StudentRepository extends JpaRepository <Student, Long> {
}
