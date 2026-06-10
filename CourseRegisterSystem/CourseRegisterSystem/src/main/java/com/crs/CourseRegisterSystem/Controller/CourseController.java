package com.crs.CourseRegisterSystem.Controller;


import com.crs.CourseRegisterSystem.Model.CourseModel;
import com.crs.CourseRegisterSystem.Model.CourseRegister;
import com.crs.CourseRegisterSystem.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins ="http://127.0.0.1:5500" )
public class CourseController {

    @Autowired
    CourseService courseService;

    @GetMapping("/courses")
    public List<CourseModel> availableCourses(){
      return courseService.availableCourses();
    }

    @GetMapping("/courses/{courseId}")
    public CourseModel getCourseById(@PathVariable("courseId") String courseId){
      return courseService.getCourseById(courseId);
    }

    @GetMapping("/courses/enrolled")
    public List<CourseRegister> enrolledStudents(){
        return courseService.enrolledStudents();
    }

    @PostMapping("/courses/register")
    public String enrollCourse(@RequestParam("name") String name,
                               @RequestParam("emailId") String emailId,
                               @RequestParam("courseName") String courseName){

            courseService.enrollCourse(name,emailId,courseName);
return "Congratulations! "+name+ " Your Enrollment Success "+courseName;
    }

}
