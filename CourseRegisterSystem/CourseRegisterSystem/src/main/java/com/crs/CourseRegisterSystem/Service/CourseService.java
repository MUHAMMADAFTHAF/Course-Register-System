package com.crs.CourseRegisterSystem.Service;


import com.crs.CourseRegisterSystem.Model.CourseModel;
import com.crs.CourseRegisterSystem.Model.CourseRegister;
import com.crs.CourseRegisterSystem.Repository.CourseRegisterRepo;
import com.crs.CourseRegisterSystem.Repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    CourseRegisterRepo courseRegisterRepo;

    public List<CourseModel> availableCourses() {
       return courseRepository.findAll();
    }

    public CourseModel getCourseById(String courseId) {
        return courseRepository.findById(courseId).orElse(null);
    }

    public List<CourseRegister> enrolledStudents() {
        return courseRegisterRepo.findAll();
    }

    public void enrollCourse(String name, String emailId, String courseName) {
        CourseRegister courseRegister = new CourseRegister(name,emailId,courseName);
        courseRegisterRepo.save(courseRegister);
    }
}
