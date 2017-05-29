/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quizztool.quizztoolbackend.services;

import com.quizztool.quizztoolbackend.models.Quizz;
import com.quizztool.quizztoolbackend.repositories.QuizzRepository;
import java.util.List;
import javax.ws.rs.*;

/**
 *
 * @author Dhiaa Eddin Anabtawi
 */
public class QuizService {
    QuizzRepository quizzRepository = new QuizzRepository();

    public List<Quizz> getQuizzes() {
        return quizzRepository.getQuizzes();
    }
    
    public Quizz getQuizz(int id){
        return quizzRepository.getQuizz(id);
    }
}
