package com.quizztool.quizztoolbackend.services;

import com.quizztool.quizztoolbackend.models.Quizz;
import com.quizztool.quizztoolbackend.repositories.QuizzRepository;
import java.util.List;

public class QuizzService {
    QuizzRepository quizzRepository = new QuizzRepository();

    public List<Quizz> getQuizzes() {
        return quizzRepository.getQuizzes();
    }
    
}
