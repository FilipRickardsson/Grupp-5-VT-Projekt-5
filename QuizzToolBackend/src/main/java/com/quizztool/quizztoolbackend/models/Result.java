/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quizztool.quizztoolbackend.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author Dhiaa Eddin Anabtawi
 */
public class Result {
    @Id@GeneratedValue
    private int id;
    
    @Enumerated(EnumType.STRING)
    private GradeType grade;
    
    private int points;
    private String time;
    
    @ManyToOne
    @JsonManagedReference
    private QuizzUser quizzUser;
    
    @ManyToOne
    @JsonManagedReference
    private Quizz quizz;

    public Result() {
    }

    public Result(int id, GradeType grade, int points, String time, QuizzUser quizzUser, Quizz quizz) {
        this.id = id;
        this.grade = grade;
        this.points = points;
        this.time = time;
        this.quizzUser = quizzUser;
        this.quizz = quizz;
    }

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
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public QuizzUser getQuizzUser() {
        return quizzUser;
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
