package com.quizztool.quizztoolbackend.repositories;

import com.quizztool.quizztoolbackend.models.QuizzUser;
import java.util.List;
import org.hibernate.Session;

public class QuizzUserRepository {

    public List<QuizzUser> getQuizzUsers() {
        Session session = HibernateUtil.getSession();
        session.beginTransaction();
        List<QuizzUser> quizzUsers = session.createCriteria(QuizzUser.class).list();
        session.close();
        return quizzUsers;
    }

}
