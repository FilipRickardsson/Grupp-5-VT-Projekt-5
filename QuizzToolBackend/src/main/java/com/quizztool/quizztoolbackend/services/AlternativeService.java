package com.quizztool.quizztoolbackend.services;

import com.quizztool.quizztoolbackend.models.Alternative;
import com.quizztool.quizztoolbackend.repositories.AlternativeRepository;

public class AlternativeService {

    AlternativeRepository alternativeRepository = new AlternativeRepository();

    public void addAlternative(Alternative alternativeToAdd, int questionId) {
        alternativeRepository.addAlternative(alternativeToAdd, questionId);
    }

}
