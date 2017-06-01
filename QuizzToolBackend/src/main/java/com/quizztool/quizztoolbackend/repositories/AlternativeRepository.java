
package com.quizztool.quizztoolbackend.repositories;

import com.quizztool.quizztoolbackend.models.Alternative;
import java.util.List;
import org.hibernate.Session;


public class AlternativeRepository {
    
    public List<Alternative> getAlternatives() {
        Session session = HibernateUtil.getSession();
        List<Alternative> alternatives = session.createCriteria(Alternative.class).list();
        session.close();
        return alternatives;
    }
    
}