package com.quizztool.quizztoolbackend.repositories;

import com.quizztool.quizztoolbackend.models.QuizzResult;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

public class QuizzResultRepository {

    public List<QuizzResult> getQuizzResult(int quizzId) {
        Session session = HibernateUtil.getSession();

        Criteria criteria = session.createCriteria(QuizzResult.class);
        criteria.add(Restrictions.eq("quizz.quizzId", quizzId));
        List<QuizzResult> quizzResults = criteria.list();

        for (QuizzResult qr : quizzResults) {
            System.out.println(qr.getQuizzUserC().getCourses().toString());
        }

        session.close();
        return quizzResults;
    }

    public void addResult(QuizzResult quizzResult) {
        Session session = HibernateUtil.getSession();
        session.beginTransaction();
        session.save(quizzResult);
        session.getTransaction().commit();
        session.close();
    }

    public List<QuizzResult> getUserQuizzResults(int userId) {
        Session session = HibernateUtil.getSession();

        Criteria criteria = session.createCriteria(QuizzResult.class);
        criteria.add(Restrictions.eq("quizzUser.id", userId));
        List<QuizzResult> quizzResults = criteria.list();

        for (QuizzResult qr : quizzResults) {
            System.out.println(qr.getQuizzUserC().getCourses().toString());
            System.out.println(qr.getQuizz().toString());
        }

        session.close();
        return quizzResults;
    }

}
