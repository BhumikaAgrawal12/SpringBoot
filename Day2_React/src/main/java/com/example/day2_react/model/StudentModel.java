package com.example.day2_react.model;

public class StudentModel {
    private String name ;
    private String email;
    private int id;

    public StudentModel(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public StudentModel(String name,String email,int id){
        this.id=id;
        this.email=email;
        this.name=name;
    }
}


