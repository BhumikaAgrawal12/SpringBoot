package com.example.day3sms.service;

import com.example.day3sms.model.StudentModel;
import com.example.day3sms.repository.StudentRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    private final StudentRepository repository;

    public StudentService(StudentRepository Repository) {
        this.repository = Repository;
    }

    public StudentModel addStudent(StudentModel student) {
        return repository.save(student);
    }

    // Display students
    public List<StudentModel> getStudent(){
        return repository.findAll();
    }
    //Update
    public StudentModel updateStudent(String id,StudentModel student){
        StudentModel existingStudent=repository.findById(id)
                .orElseThrow(()->new RuntimeException("No Student found"));
        existingStudent.setName(student.getName());
        existingStudent.setAge(student.getAge());
        existingStudent.setEmail(student.getEmail());

        return repository.save(existingStudent);
    }


}

