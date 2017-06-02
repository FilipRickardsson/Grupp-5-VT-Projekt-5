package com.quizztool.quizztoolbackend.repositories;

import com.quizztool.quizztoolbackend.models.Quizz;
import java.util.List;
import org.hibernate.Session;

public class QuizzRepository {
    
    public List<Quizz> getQuizzes() {
        Session session = HibernateUtil.getSession();
        List<Quizz> quizzes = session.createCriteria(Quizz.class).list();
        session.close();
        return quizzes;
    }
}
