package com.crs.CourseRegisterSystem.Repository;


import com.crs.CourseRegisterSystem.Model.CourseModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<CourseModel, String> {



}
