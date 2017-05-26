/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quizztool.quizztoolbackend.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

/**
 *
 * @author Dhiaa Eddin Anabtawi
 */
@Entity
public class Quizz implements Serializable{
    
    @Id
    @GeneratedValue
    private int quizId;
    
    private String name;
    private boolean showResult;
    
    @ManyToMany(mappedBy="Question")
    @JsonBackReference
    @JsonIgnore  
    private List<Question> questions;
    
    @ManyToMany(mappedBy="Course")
    @JsonBackReference
    private List<Course> courses;
    
    @OneToMany(mappedBy="Result")
    @JsonBackReference
    @JsonIgnore
    private List<Result> results;

    public Quizz() {
    }

    public Quizz(int quizId, String name, boolean showResult, List<Question> questions, List<Course> courses, List<Result> results) {
        this.quizId = quizId;
        this.name = name;
        this.showResult = showResult;
        this.questions = questions;
        this.courses = courses;
        this.results = results;
    }

    public int getQuizId() {
        return quizId;
    }

    public void setQuizId(int quizId) {
        this.quizId = quizId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isShowResult() {
        return showResult;
    }

    public void setShowResult(boolean showResult) {
        this.showResult = showResult;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }
}
