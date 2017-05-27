package com.quizztool.quizztoolbackend.repositories;

import com.quizztool.quizztoolbackend.models.QuizzUser;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

public class QuizzUserRepository {

    public QuizzUser getQuizzUser(String username, String password) {
        Session session = HibernateUtil.getSession();

        Criteria criteria = session.createCriteria(QuizzUser.class);
        criteria.add(Restrictions.like("username", username, MatchMode.EXACT));
        criteria.add(Restrictions.like("password", password, MatchMode.EXACT));
        QuizzUser quizzUser = (QuizzUser) criteria.uniqueResult();

        System.out.println("Debug 1: " + quizzUser);
        System.out.println("Debug 2: " + quizzUser.getCourses().toString());

        session.close();
        return quizzUser;
    }

}
