package com.quizztool.quizztoolbackend.resources;

import com.quizztool.quizztoolbackend.models.Course;
import com.quizztool.quizztoolbackend.services.CourseService;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/courses")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CourseResource {

    private CourseService courseService = new CourseService();

    @GET
    public List<Course> getCourses() {
        return courseService.getCourses();
    }

}
