
package com.quizztool.quizztoolbackend.services;

import com.quizztool.quizztoolbackend.models.Question;
import com.quizztool.quizztoolbackend.models.Quizz;
import com.quizztool.quizztoolbackend.repositories.QuestionRepository;
import java.util.List;


public class QuestionService {

    QuestionRepository questionRepository = new QuestionRepository();

    public List<Question> getQuestions() {
        return questionRepository.getQuestions();
         
    }
    public Question getQuestion(int QuizzId){
        return questionRepository.getQuestion(QuizzId);
    }

}
