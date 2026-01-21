package com.example.day3sms.service;

import com.example.day3sms.model.StudentModel;
import com.example.day3sms.repository.StudentRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    private final StudentRepository repository;
    public StudentService(StudentRepository Repository){
        this.repository=Repository;
    }
    public StudentModel addStudent(StudentModel student){
        return repository.save(student);
    }
}
