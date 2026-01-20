package com.example.day3sms.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.lang.annotation.Documented;

@Data

// #it creates all the constructors
@AllArgsConstructor
//optional
@NoArgsConstructor
//mongodb dependency ka part
@Document(collection="Springboot")


public class StudentModel {
    @Id
    private String id;
    private String name;
    private int age;
    private String email;
}
