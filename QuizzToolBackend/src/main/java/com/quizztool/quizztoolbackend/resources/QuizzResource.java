package com.quizztool.quizztoolbackend.resources;

import com.quizztool.quizztoolbackend.models.Quizz;
import com.quizztool.quizztoolbackend.services.QuizzService;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/quizzes")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class QuizzResource {

    QuizzService quizzService = new QuizzService();

    @GET
    public List<Quizz> getQuizzes() {
        return quizzService.getQuizzes();
    }
    
    @POST
    public void addQuizz(Quizz quizzToAdd) {
        quizzService.addQuizz(quizzToAdd);
    }

}
