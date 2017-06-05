package com.quizztool.quizztoolbackend.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Quizz implements Serializable {

    @Id
    @GeneratedValue
    private int quizzId;

    private String name;
    private boolean showResult;

    @OneToMany(mappedBy = "quizz")
    @JsonManagedReference
    private List<Question> questions;

    @ManyToOne
    @JsonBackReference
    private Course course;

    @OneToMany(mappedBy = "quizz")
    @JsonBackReference
    private List<QuizzResult> results;

    public Quizz() {
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

    public void setCourses(Course course) {
        this.course = course;
    }

    public void setResults(List<QuizzResult> results) {
        this.results = results;
    }

}
