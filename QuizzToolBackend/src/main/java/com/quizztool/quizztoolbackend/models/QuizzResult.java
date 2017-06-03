package com.quizztool.quizztoolbackend.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class QuizzResult implements Serializable {

    @Id
    @GeneratedValue
    private int id;

    @Enumerated(EnumType.STRING)
    private GradeType grade;

    private int points;
    private String quizzTime;

    @ManyToOne
    @JsonManagedReference
    private QuizzUser quizzUser;

    @ManyToOne
    @JsonManagedReference
    private Quizz quizz;

    public QuizzResult() {
    }

//    public QuizzResult(int id, GradeType grade, int points, String quizzTime, QuizzUser quizzUser, Quizz quizz) {
//        this.id = id;
//        this.grade = grade;
//        this.points = points;
//        this.quizzTime = quizzTime;
//        this.quizzUser = quizzUser;
//        this.quizz = quizz;
//    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public GradeType getGrade() {
        return grade;
    }

    public void setGrade(GradeType grade) {
        this.grade = grade;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public String getTime() {
        return quizzTime;
    }

    public void setTime(String time) {
        this.quizzTime = time;
    }

    public QuizzUser getQuizzUserC() {
        return quizzUser;
    }

    public QuizzUser getQuizzUser() {
        return this.quizzUser;
    }

    public void setQuizzUser(QuizzUser quizzUser) {
        this.quizzUser = quizzUser;
    }

    public Quizz getQuizz() {
        return quizz;
    }
    
    public void setQuizz(Quizz quizz) {
        this.quizz = quizz;
    }

}
