/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quizztool.quizztoolbackend.repositories;

import com.quizztool.quizztoolbackend.models.Quizz;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Dhiaa Eddin Anabtawi
 */
public class QuizzRepository {
    
    public List<Quizz> getQuizzes() {
        Session session = HibernateUtil.getSession();
        session.beginTransaction();
        List<Quizz> quizzes = session.createCriteria(Quizz.class).list();
        session.close();
        return quizzes;
    }
}
