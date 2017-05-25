package com.quizztool.quizztoolbackend.services;

import com.quizztool.quizztoolbackend.models.QuizzUser;
import com.quizztool.quizztoolbackend.repositories.QuizzUserRepository;

public class QuizzUserService {

    QuizzUserRepository quizzUserRepository = new QuizzUserRepository();

    public QuizzUser getQuizzUser(String username, String password) {
        return quizzUserRepository.getQuizzUser(username, password);
    }

}
