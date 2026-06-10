package com.crs.CourseRegisterSystem.Model;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "course_register")
public class CourseRegister {
    public CourseRegister() {

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String emailId;
    private String courseName;

    public CourseRegister(String name, String emailId, String courseName) {
        this.name = name;
        this.emailId = emailId;
        this.courseName = courseName;
    }
}
