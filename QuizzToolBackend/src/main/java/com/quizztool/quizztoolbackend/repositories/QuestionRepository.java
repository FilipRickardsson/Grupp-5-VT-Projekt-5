
package com.quizztool.quizztoolbackend.repositories;

import com.quizztool.quizztoolbackend.models.Question;
import java.util.List;
import org.hibernate.Session;


public class QuestionRepository {
    public List<Question> getQuizzes() {
        Session session = HibernateUtil.getSession();
        List<Question> questions = session.createCriteria(Question.class).list();
        session.close();
        return questions;
    }
    
}
