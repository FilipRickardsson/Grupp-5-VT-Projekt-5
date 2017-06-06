package com.quizztool.quizztoolbackend.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Alternative implements Serializable {

    @Id
    @GeneratedValue
    private int alternativeId;
    private String text;
    private boolean correct;

    @ManyToOne
    @JsonBackReference
    private Question question;

    public Alternative() {
    }

    public int getAlternativeId() {
        return alternativeId;
    }

    public void setAlternativeId(int alternativeId) {
        this.alternativeId = alternativeId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isCorrect() {
        return correct;
    }

    public void setCorrect(boolean correct) {
        this.correct = correct;
    }

//    public List<Question> getQuestions() {
//        return questions;
//    }

//    public List<QuizzUser> getQuizzUsers() {
//        return quizzUsers;
//    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    
    
}
