package com.quizztool.quizztoolbackend.repositories;

import com.quizztool.quizztoolbackend.models.Alternative;
import com.quizztool.quizztoolbackend.models.Question;
import org.hibernate.Session;

public class AlternativeRepository {

    public void addAlternative(Alternative alternativeToAdd, int questionId) {
        Session session = HibernateUtil.getSession();
        session.beginTransaction();

        Question persistenceQuestion = (Question) session.load(Question.class, questionId);
        alternativeToAdd.setQuestion(persistenceQuestion);

        session.save(alternativeToAdd);
        session.getTransaction().commit();
        session.close();
    }

}
