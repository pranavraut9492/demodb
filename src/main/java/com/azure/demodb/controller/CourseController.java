package com.azure.demodb.controller;

import com.azure.demodb.model.Course;
import com.azure.demodb.repo.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/course")
public class CourseController {

    @Autowired
    CourseRepo courseRepo;

    @GetMapping("/getCourses")
    public Iterable<Course> getCourses(){

        return courseRepo.findAll();
    }



    @PostMapping("/addCourses")
    public Course addCourses(@RequestBody Course course){
        return courseRepo.save(course);
    }

    @GetMapping("/getCourseById")
    public Optional<Course> getCourseById(@RequestParam(name = "course_code") String id){
        return courseRepo.findById(id);
    }


}
