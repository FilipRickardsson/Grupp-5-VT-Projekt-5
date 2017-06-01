/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
        QuestionService questionService= new QuestionService();
 
    @GET
    @Path("{quizzId}")
    public List<Question> getQuestions(@PathParam("quizzId")int quizzId) {
 
        return questionService.getQuestions(quizzId);
 
 
}
 

    
}
