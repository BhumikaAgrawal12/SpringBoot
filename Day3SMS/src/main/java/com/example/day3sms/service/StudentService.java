package com.example.day3sms.service;

import com.example.day3sms.dto.StudentRequestDto;
import com.example.day3sms.dto.StudentResponseDto;
import com.example.day3sms.model.StudentModel;
import com.example.day3sms.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository repository;

    public StudentService(StudentRepository Repository) {
        this.repository = Repository;
    }

//    public StudentModel addStudent(StudentModel student) {
//        return repository.save(student);
//    }

    public StudentResponseDto addStudent(StudentRequestDto dto){
        StudentModel student=new StudentModel();
        student.setName(dto.getName());
        student.setAge(dto.getAge());
        student.setEmail(dto.getEmail());

        StudentModel saved=repository.save(student);
        return new StudentResponseDto(saved.getId(),saved.getName(),saved.getAge(),saved.getEmail());
    }

    // Display students
    public List<StudentModel> getStudent(){
        return repository.findAll();
    }
    public List<StudentResponseDto> getAllStudents(){
        return repository.findAll().stream().map(s->new StudentResponseDto(s.getId(),s.getName(),s.getAge(),s.getEmail())).toList();
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
    public void deleteStudent(String id){
        repository.deleteById(id);
    }

}

