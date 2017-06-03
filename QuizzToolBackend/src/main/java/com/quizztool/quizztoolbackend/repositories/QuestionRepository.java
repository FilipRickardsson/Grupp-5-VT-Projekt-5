package com.quizztool.quizztoolbackend.repositories;

import com.quizztool.quizztoolbackend.models.Question;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

public class QuestionRepository {

    public List<Question> getQuestions(int quizzId) {
        Session session = HibernateUtil.getSession();

        Criteria criteria = session.createCriteria(Question.class);
        criteria.add(Restrictions.eq("quizz.quizzId", quizzId));
        List<Question> questions = criteria.list();
        
        for(Question q : questions) {
            questions.toString();
        }

        session.close();
        return questions;
    }

}
