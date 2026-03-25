package com.attendance.service;

import com.attendance.model.Student;
import com.attendance.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository repo;

    public StudentService(StudentRepository repo) {
        this.repo = repo;
    }

    public Student addStudent(Student student) {
        return repo.save(student);
    }

    public List<Student> getStudents() {
        return repo.findAll();
    }

    public void deleteStudent(Long id) {
        repo.deleteById(id);
    }
}