package com.quizztool.quizztoolbackend.services;

import com.quizztool.quizztoolbackend.models.Alternative;
import com.quizztool.quizztoolbackend.models.GradeType;
import com.quizztool.quizztoolbackend.models.Question;
import com.quizztool.quizztoolbackend.models.Quizz;
import com.quizztool.quizztoolbackend.models.QuizzResult;
import com.quizztool.quizztoolbackend.models.QuizzUser;
import com.quizztool.quizztoolbackend.repositories.QuestionRepository;
import com.quizztool.quizztoolbackend.repositories.QuizzRepository;
import com.quizztool.quizztoolbackend.repositories.QuizzResultRepository;
import java.util.List;

public class QuizzResultService {

    QuizzResultRepository quizzResultRepository = new QuizzResultRepository();

    public List<QuizzResult> getQuizzResults(int quizzId) {
        return quizzResultRepository.getQuizzResults(quizzId);
    }

    public QuizzResult submitAnswers(int userId, int quizzId, String answersRaw) {
        QuestionRepository questionRepository = new QuestionRepository();
        List<Question> questions = questionRepository.getQuestions(quizzId);

        String answersSplitted[] = answersRaw.split(",");

        int points = 0;
        GradeType grade;

        for (Question q : questions) {
            for (Alternative a : q.getAlternatives()) {
                if (a.isCorrect()) {
                    for (String s : answersSplitted) {
                        if (Integer.parseInt(s) == a.getAlternativeId()) {
                            points++;
                        }
                    }
                }
            }
        }

        if (points >= Math.floor(questions.size() * 0.75)) {
            grade = GradeType.VG;
        } else if (points >= Math.floor(questions.size() * 0.5)) {
            grade = GradeType.G;
        } else {
            grade = GradeType.IG;
        }

        QuizzResult quizzResult = new QuizzResult();
        quizzResult.setGrade(grade);
        quizzResult.setPoints(points);
        QuizzUser qu = new QuizzUser();
        qu.setId(userId);
        quizzResult.setQuizzUser(qu);
        Quizz q = new Quizz();
        q.setQuizzId(quizzId);
        quizzResult.setQuizz(q);

        quizzResultRepository.addResult(quizzResult);

        QuizzRepository quizzRepository = new QuizzRepository();
        Quizz quizz = quizzRepository.getQuizz(quizzId);

        if (quizz.isShowResult()) {
            return quizzResult;
        } else {
            return null;
        }
    }

    public List<QuizzResult> getUserQuizzResults(int userId) {
        return quizzResultRepository.getUserQuizzResults(userId);
    }

}
