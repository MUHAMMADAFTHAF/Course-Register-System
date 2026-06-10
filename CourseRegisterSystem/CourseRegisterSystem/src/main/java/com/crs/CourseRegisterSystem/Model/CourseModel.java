package com.crs.CourseRegisterSystem.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "courses")
public class CourseModel {

    @Id
    private String courseId;
    private String courseName;
    private String trainer;
    private int durationInWeeks;
}
