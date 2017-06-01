package com.quizztool.quizztoolbackend.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Quizz implements Serializable {

    @Id
    @GeneratedValue
    private int quizzId;

    private String name;
    private boolean showResult;
    
    private Date startTime;
    private Date endTime;

    @ManyToMany
    @JsonManagedReference
    private List<Question> questions;

    @ManyToMany(mappedBy = "quizzes")
    @JsonBackReference
    private List<Course> courses;

    @OneToMany(mappedBy = "quizz")
    @JsonBackReference
    private List<QuizzResult> results;

    public Quizz() {
    }

    public Quizz(int quizzId, String name, boolean showResult, List<Question> questions, List<Course> courses, List<QuizzResult> results) {
        this.quizzId = quizzId;
        this.name = name;
        this.showResult = showResult;
        this.questions = questions;
        this.courses = courses;
        this.results = results;
    }

    public Quizz(int quizzId, String name, boolean showResult, Date startTime, Date endTime, List<Question> questions, List<Course> courses, List<QuizzResult> results) {
        this.quizzId = quizzId;
        this.name = name;
        this.showResult = showResult;
        this.startTime = startTime;
        this.endTime = endTime;
        this.questions = questions;
        this.courses = courses;
        this.results = results;
    }
    
    

    public int getQuizzId() {
        return quizzId;
    }

    public void setQuizzId(int quizzId) {
        this.quizzId = quizzId;
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

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public void setResults(List<QuizzResult> results) {
        this.results = results;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
    
    

}
