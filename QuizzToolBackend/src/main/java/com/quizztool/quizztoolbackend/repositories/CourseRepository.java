package com.quizztool.quizztoolbackend.repositories;

import com.quizztool.quizztoolbackend.models.Course;
import java.util.List;
import org.hibernate.Session;

public class CourseRepository {

    public List<Course> getCourses() {
        Session session = HibernateUtil.getSession();
        List<Course> courses = session.createCriteria(Course.class).list();

        for (Course c : courses) {
            c.getQuizzes().size();
        }

        session.close();
        return courses;
    }



}
