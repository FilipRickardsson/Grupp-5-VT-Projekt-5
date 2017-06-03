package com.quizztool.quizztoolbackend.resources;

import com.quizztool.quizztoolbackend.models.QuizzResult;
import com.quizztool.quizztoolbackend.services.QuizzResultService;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/quizzresults")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class QuizzResultResource {

    QuizzResultService quizzResultService = new QuizzResultService();

    @GET
    @Path("{quizzId}")
    public List<QuizzResult> getQuizzUser(@PathParam("quizzId") int quizzId) {
        List<QuizzResult> list = quizzResultService.getQuizzResult(quizzId);

        for (QuizzResult qr : list) {
            System.out.println(qr.getQuizzUserC().getUsername());
        }

        return list;
    }

    @GET
    @Path("{userId}&{quizzId}&{answers}")
    public QuizzResult submitAnswers(@PathParam("userId") int userId, @PathParam("quizzId") int quizzId, @PathParam("answers") String answers) {
        return quizzResultService.submitAnswers(userId, quizzId, answers);
    }

    @GET
    @Path("/userresults/{userId}")
    public List<QuizzResult> getUserQuizzResults(@PathParam("userId") int userId) {
        return quizzResultService.getUserQuizzResults(userId);
    }

}
