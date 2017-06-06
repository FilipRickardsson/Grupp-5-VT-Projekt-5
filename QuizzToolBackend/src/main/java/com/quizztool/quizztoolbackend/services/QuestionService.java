package com.quizztool.quizztoolbackend.services;

import com.quizztool.quizztoolbackend.models.Question;
import com.quizztool.quizztoolbackend.repositories.QuestionRepository;
import java.util.List;

public class QuestionService {

    private QuestionRepository questionRepository = new QuestionRepository();

    public List<Question> getQuestions(int quizzId) {
        return questionRepository.getQuestions(quizzId);
    }

    public void addQuestion(Question questionToAdd, int quizzId) {
        questionRepository.addQuestion(questionToAdd, quizzId);
    }

    public Question getLastQuestion() {
        return questionRepository.getLastQuestion();
    }

}
