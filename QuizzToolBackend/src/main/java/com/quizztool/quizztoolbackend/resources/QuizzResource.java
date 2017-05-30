/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quizztool.quizztoolbackend.resources;

import com.quizztool.quizztoolbackend.models.Quizz;
import com.quizztool.quizztoolbackend.services.QuizService;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Dhiaa Eddin Anabtawi
 */
@Path("/quizzes")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class QuizzResource {
    QuizService quizService= new QuizService();
    
@GET
public List<Quizz> getQuizzes(){
  return quizService.getQuizzes();
}

}
