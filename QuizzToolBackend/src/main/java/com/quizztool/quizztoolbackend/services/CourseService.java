package com.quizztool.quizztoolbackend.services;

import com.quizztool.quizztoolbackend.models.Course;
import com.quizztool.quizztoolbackend.repositories.CourseRepository;
import java.util.List;

public class CourseService {

    private CourseRepository courseRepository = new CourseRepository();

    public List<Course> getCourses() {
        return courseRepository.getCourses();
    }



}
