package com.quizztool.quizztoolbackend.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.quizztool.quizztoolbackend.models.QuizzUser;
import com.quizztool.quizztoolbackend.services.QuizzUserService;
import java.util.List;

@Path("/quizz_users")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class QuizzUserResource {

    QuizzUserService quizzUserService = new QuizzUserService();

    @GET
    public List<QuizzUser> getQuizzUsers() {
        return quizzUserService.getQuizzUsers();
    }

}
