package com.quizztool.quizztoolbackend.repositories;

import com.quizztool.quizztoolbackend.models.Course;
import com.quizztool.quizztoolbackend.models.Quizz;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
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

    public void addQuizz(Quizz quizzToAdd, int courseId) {
        Session session = HibernateUtil.getSession();
        session.beginTransaction();

        Course persistenceCourse = (Course) session.load(Course.class, courseId);
        quizzToAdd.setCourse(persistenceCourse);

        session.save(quizzToAdd);
        session.getTransaction().commit();
        session.close();
    }

    public Quizz getLastQuizz() {
        Session session = HibernateUtil.getSession();

        Criteria criteria = session.createCriteria(Quizz.class);
        criteria.addOrder(Order.desc("quizzId"));
        criteria.setMaxResults(1);
        Quizz quizz = (Quizz) criteria.uniqueResult();

        session.close();
        return quizz;
    }

}
