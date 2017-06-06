package com.quizztool.quizztoolbackend.repositories;

import com.quizztool.quizztoolbackend.models.Alternative;
import com.quizztool.quizztoolbackend.models.Question;
import org.hibernate.Session;

public class AlternativeRepository {

    public void addAlternative(Alternative alternativeToAdd, int questionId) {
        Session session = HibernateUtil.getSession();
        session.beginTransaction();

        System.out.println("BE Debagger 1: " + questionId);

        Question persistenceQuestion = (Question) session.load(Question.class, questionId);
        System.out.println("BE Debagger 2: " + persistenceQuestion.getId());

        alternativeToAdd.setQuestion(persistenceQuestion);

        session.save(alternativeToAdd);
        session.getTransaction().commit();
        session.close();
    }

}
