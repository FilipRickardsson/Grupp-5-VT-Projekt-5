package com.quizztool.quizztoolbackend.resources;

import com.quizztool.quizztoolbackend.models.Alternative;
import com.quizztool.quizztoolbackend.services.AlternativeService;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/alternatives")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class AlternativeResource {

    AlternativeService alternativeService = new AlternativeService();

    @POST
    @Path("{questionId}")
    public void addQuizz(Alternative alternativeToAdd, @PathParam("questionId") int questionId) {
        alternativeService.addAlternative(alternativeToAdd, questionId);
    }

}
