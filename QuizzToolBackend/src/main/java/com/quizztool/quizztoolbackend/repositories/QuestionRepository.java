package com.quizztool.quizztoolbackend.repositories;

import com.quizztool.quizztoolbackend.models.Course;
import com.quizztool.quizztoolbackend.models.Question;
import com.quizztool.quizztoolbackend.models.Quizz;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

public class QuestionRepository {

    public List<Question> getQuestions(int quizzId) {
        Session session = HibernateUtil.getSession();

        Criteria criteria = session.createCriteria(Question.class);
        criteria.add(Restrictions.eq("quizz.quizzId", quizzId));
        List<Question> questions = criteria.list();

        for (Question q : questions) {
            questions.toString();
        }

        session.close();
        return questions;
    }

    public void addQuestion(Question questionToAdd, int quizzId) {
        Session session = HibernateUtil.getSession();
        session.beginTransaction();

//        System.out.println("BE Debagger 1: " + quizzId);

        Quizz persistenceQuizz = (Quizz) session.load(Quizz.class, quizzId);
//        System.out.println("BE Debagger 2: " + persistenceQuizz.getQuizzId());

        questionToAdd.setQuizz(persistenceQuizz);

        session.save(questionToAdd);
        session.getTransaction().commit();
        session.close();
    }

    public Question getLastQuestion() {
        Session session = HibernateUtil.getSession();

        Criteria criteria = session.createCriteria(Question.class);
        criteria.addOrder(Order.desc("id"));
        criteria.setMaxResults(1);
        Question question = (Question) criteria.uniqueResult();
        
        question.toString();

        session.close();
        return question;
    }

}
