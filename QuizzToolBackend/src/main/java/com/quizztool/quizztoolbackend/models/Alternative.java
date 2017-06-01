package com.quizztool.quizztoolbackend.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Alternative implements Serializable {
    
    @Id
    @GeneratedValue
    private int alternativeId;
    private String text;
    private boolean correct;

    @ManyToMany(mappedBy = "alternatives")
    @JsonBackReference
    private List<Question> questions;

    @ManyToMany(mappedBy = "answers")
    @JsonManagedReference
    private List<QuizzUser> quizzUsers;

    public Alternative() {
    }

    public Alternative(int alternativeId, String text, boolean correct, List<Question> questions, List<QuizzUser> quizzUsers) {
        this.alternativeId = alternativeId;
        this.text = text;
        this.correct = correct;
        this.questions = questions;
        this.quizzUsers = quizzUsers;
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

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    public List<QuizzUser> getQuizzUsers() {
        return quizzUsers;
    }

    public void setQuizzUsers(List<QuizzUser> quizzUsers) {
        this.quizzUsers = quizzUsers;
    }

}
