package com.quizztool.quizztoolbackend.services;

import com.quizztool.quizztoolbackend.models.Quizz;
import com.quizztool.quizztoolbackend.repositories.QuizzRepository;
import java.util.List;

public class QuizzService {

    QuizzRepository quizzRepository = new QuizzRepository();

    public List<Quizz> getQuizzes() {
        return quizzRepository.getQuizzes();
    }

    public void addQuizz(Quizz quizzToAdd, int courseId) {
        quizzRepository.addQuizz(quizzToAdd, courseId);
    }

    public Quizz getLastQuizz() {
        return quizzRepository.getLastQuizz();
    }

}
