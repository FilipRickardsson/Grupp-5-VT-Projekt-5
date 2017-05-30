package com.quizztool.quizztoolbackend.services;

import com.quizztool.quizztoolbackend.models.QuizzResult;
import com.quizztool.quizztoolbackend.repositories.QuizzResultRepository;
import java.util.List;

public class QuizzResultService {

    QuizzResultRepository quizzResultRepository = new QuizzResultRepository();
    
    public List<QuizzResult> getQuizzResult(int quizzId) {
        return quizzResultRepository.getQuizzResult(quizzId);
    }

}
