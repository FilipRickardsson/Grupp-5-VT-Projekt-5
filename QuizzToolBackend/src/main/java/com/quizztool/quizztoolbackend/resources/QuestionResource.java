package com.quizztool.quizztoolbackend.resources;

import com.quizztool.quizztoolbackend.models.Question;
import com.quizztool.quizztoolbackend.services.QuestionService;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/questions")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class QuestionResource {

    private QuestionService questionService = new QuestionService();

    @GET
    @Path("{quizzId}")
    public List<Question> getQuestions(@PathParam("quizzId") int quizzId) {
        return questionService.getQuestions(quizzId);

    }
}
