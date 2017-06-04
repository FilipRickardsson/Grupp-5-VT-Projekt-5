package com.quizztool.quizztoolbackend.repositories;

import com.quizztool.quizztoolbackend.models.Quizz;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

public class QuizzRepository {

    public List<Quizz> getQuizzes() {
        Session session = HibernateUtil.getSession();
        List<Quizz> quizzes = session.createCriteria(Quizz.class).list();
        session.close();
        return quizzes;
    }

    public Quizz getQuizz(int quizzId) {
        Session session = HibernateUtil.getSession();

        Criteria criteria = session.createCriteria(Quizz.class);
        criteria.add(Restrictions.eq("quizzId", quizzId));
        Quizz quizz = (Quizz) criteria.uniqueResult();

        session.close();
        return quizz;
    }

    public void addQuizz(Quizz quizzToAdd) {
        Session session = HibernateUtil.getSession();
        session.beginTransaction();
        session.save(quizzToAdd);
        session.getTransaction().commit();
        session.close();
    }

}
