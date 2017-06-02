package com.quizztool.quizztoolbackend.resources;

import com.quizztool.quizztoolbackend.models.QuizzResult;
import com.quizztool.quizztoolbackend.services.QuizzResultService;
import java.util.List;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/quizzresults")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class QuizzResultResource {

    QuizzResultService quizzResultService = new QuizzResultService();

    @GET
    @Path("{quizzId}")
    public List<QuizzResult> getQuizzUser(@PathParam("quizzId") int quizzId) {
        return quizzResultService.getQuizzResult(quizzId);
    }

    @POST
    @Path("{quizzUserId}&{alternativeId}")
    public void saveResult(@PathParam("quizzUserId") int quizzUserId, @PathParam("questionId") int questionId, @PathParam("alternativeId") int alternativeId){
        //quizzResultService.saveQuizzResult();
        System.out.println("SaveResult repository");
    }
}
