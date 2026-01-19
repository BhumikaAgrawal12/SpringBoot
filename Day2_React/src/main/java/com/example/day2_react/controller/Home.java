package com.example.day2_react.controller;

import com.example.day2_react.model.StudentModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class Home {

    @GetMapping("/")
    public StudentModel getStudent(){
        StudentModel student=new StudentModel("Bhumika","@Bhumika112",101);
        return student;
    }

    @GetMapping("/userdata")
    public ArrayList<StudentModel> getStudents(){
        ArrayList<StudentModel> students=new ArrayList<>();
        students.add(new StudentModel("Alia","@alia.com",102));
        students.add(new StudentModel("Archi","@archi.com",102));
        students.add(new StudentModel("Ishika","@ishika.com",102));
        students.add(new StudentModel("Himanshi","@himanshi.com",102));
        students.add(new StudentModel("Raghav","@raghav.com",102));
        return students;
    }

}
