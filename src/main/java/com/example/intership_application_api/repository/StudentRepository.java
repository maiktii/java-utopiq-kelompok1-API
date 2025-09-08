package com.example.intership_application_api.repository;

import com.example.intership_application_api.dto.student.StudentRequest;
import com.example.intership_application_api.entity.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

public class StudentRepository {

    private final Map<Long, Student> data = new ConcurrentHashMap<>();
    private final AtomicLong seq = new AtomicLong(0);

    public StudentRepository(){
        save(new Student(null, "Mike", "mike@gmail.com", "test", 2000));
        save(new Student(null, "Varrel", "varrel@gmail.com", "test", 2001));
    }

    public Student save(Student ev) {
        if (ev.getId() == null) ev.setId(seq.incrementAndGet());
        data.put(ev.getId(), ev);
        return ev;
    }

    public List<Student> findAllStudent(){
        return new ArrayList<Student>(data.values());
    }

    public Optional<Student> findByStudentId(Long id){
        return Optional.ofNullable(data.get(id));
    }

    public void deleteStudent(Long id) { data.remove(id); }
    public boolean studentExists(Long id) { return data.containsKey(id); }
}
