package com.quizztool.quizztoolbackend.services;

import com.quizztool.quizztoolbackend.models.Alternative;
import com.quizztool.quizztoolbackend.repositories.AlternativeReopsitory;
import java.util.List;


public class AlternativeService {
    AlternativeReopsitory alternativeReopsitory = new AlternativeReopsitory();
     public List<Alternative> getAlternativies() {
        return alternativeReopsitory.getAlternatives();
    }
    
}
