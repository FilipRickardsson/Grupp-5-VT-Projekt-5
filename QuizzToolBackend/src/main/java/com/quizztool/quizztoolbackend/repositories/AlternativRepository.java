
package com.quizztool.quizztoolbackend.repositories;

import com.quizztool.quizztoolbackend.models.Alternative;
import java.util.List;
import org.hibernate.Session;


public class AlternativRepository {
    public List<Alternative> getQuizzes() {
        Session session = HibernateUtil.getSession();
        List<Alternative> alternatives = session.createCriteria(Alternative.class).list();
        session.close();
        return alternatives;
    }
    
}
