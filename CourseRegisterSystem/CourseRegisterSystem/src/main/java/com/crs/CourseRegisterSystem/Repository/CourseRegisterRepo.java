package com.crs.CourseRegisterSystem.Repository;


import com.crs.CourseRegisterSystem.Model.CourseRegister;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRegisterRepo extends JpaRepository<CourseRegister, Integer> {


}
