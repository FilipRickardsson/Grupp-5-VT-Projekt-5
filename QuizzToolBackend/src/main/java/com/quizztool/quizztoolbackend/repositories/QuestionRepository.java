/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quizztool.quizztoolbackend.repositories;

import com.quizztool.quizztoolbackend.models.Question;
import com.quizztool.quizztoolbackend.models.QuizzResult;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Delt604
 */
public class QuestionRepository {
 
 
    public List<Question> getQuestions(int quizzId) {
        Session session = HibernateUtil.getSession();

        Criteria criteria = session.createCriteria(Question.class);
        criteria.add(Restrictions.eq("quizz.quizzId", quizzId));
        List<Question> questions = criteria.list();

        session.close();
        return questions;
    }
   
   
    
    
    
    /*public List<Question> getQuestions() {
      Session session = HibernateUtil.getSession();
        List<Question> questions = session.createCriteria(Question.class).list();
        session.close();
        return questions;
    }*/
}

