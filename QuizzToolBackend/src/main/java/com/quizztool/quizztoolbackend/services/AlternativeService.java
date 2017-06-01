
package com.quizztool.quizztoolbackend.services;

import com.quizztool.quizztoolbackend.models.Alternative;
import com.quizztool.quizztoolbackend.repositories.AlternativeRepository;
import java.util.List;


public class AlternativeService {
    
    AlternativeRepository alternativeRepository = new AlternativeRepository();

    public List<Alternative> getAlternatives() {
        return alternativeRepository.getAlternatives();
    }
}
