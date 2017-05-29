/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quizztool.quizztoolbackend.repositories;

import com.quizztool.quizztoolbackend.models.Question;
import java.util.List;
import org.hibernate.Session;


public class QuestionRepository {
    
    public List<Question> getQuestions() {
        Session session = HibernateUtil.getSession();
        List<Question> questions = session.createCriteria(Question.class).list();
        session.close();
        return questions;
    }
    
     public Question getQuestion(int QuestionId){
      Session session = HibernateUtil.getSessionFactory().openSession();
        Question question = (Question) session.get(Question.class, QuestionId);
        session.close();
        return question;
    }
    
    
}
