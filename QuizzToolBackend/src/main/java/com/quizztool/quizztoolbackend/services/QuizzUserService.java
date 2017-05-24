package com.quizztool.quizztoolbackend.services;

import com.quizztool.quizztoolbackend.models.QuizzUser;
import com.quizztool.quizztoolbackend.repositories.QuizzUserRepository;
import java.util.List;

public class QuizzUserService {

    QuizzUserRepository quizzUserRepository = new QuizzUserRepository();

    public List<QuizzUser> getQuizzUsers() {
        return quizzUserRepository.getQuizzUsers();
    }

}
