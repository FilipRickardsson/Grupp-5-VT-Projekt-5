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

        for(QuizzResult qr : quizzResults) {
            qr.toString();
        }

        session.close();
        return quizzResults;
    }

}
