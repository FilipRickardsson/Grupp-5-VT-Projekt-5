package com.quizztool.quizztoolbackend.resources;

import com.quizztool.quizztoolbackend.models.Question;
import com.quizztool.quizztoolbackend.services.QuestionService;
import java.util.List;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/questions")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class QuestionResource {

    QuestionService questionService = new QuestionService();

    @GET
    public List<Question> getQuestions() {
        return questionService.getQuestions();
    }
    @GET
    @Path("/{questionId}")
    public Question getQuestion(@PathParam("questionId")int id){
        return questionService.getQuestion(id);
    }

}
