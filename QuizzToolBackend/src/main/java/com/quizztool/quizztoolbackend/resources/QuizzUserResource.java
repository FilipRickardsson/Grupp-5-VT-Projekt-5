package com.quizztool.quizztoolbackend.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.quizztool.quizztoolbackend.models.QuizzUser;

@Path("/quizz_users")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class QuizzUserResource {

    
    
    @GET
    public QuizzUser getTeams() {
        QuizzUser qu = new QuizzUser();
        qu.setId(1);
        qu.setUsername("Boris");
        
        return qu;
    }

}
