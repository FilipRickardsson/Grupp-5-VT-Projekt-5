package com.quizztool.quizztoolbackend.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class QuizzUser implements Serializable {

    @Id
    @GeneratedValue
    private int id;
    private String username;
    private String password;

    @Enumerated(EnumType.STRING)
    private QuizzUserType quizzUserType;

    @ManyToMany(mappedBy = "quizzUsers")
    @JsonManagedReference
    private List<Course> courses;

    @ManyToMany
    @JsonBackReference
    private List<Alternative> answers;

    @OneToMany(mappedBy = "quizzUser")
    @JsonBackReference
    private List<QuizzResult> results;

    public QuizzUser() {
    }

    public QuizzUser(int id, String username, String password, QuizzUserType quizzUserType, List<Course> courses, List<Alternative> answers, List<QuizzResult> results) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.quizzUserType = quizzUserType;
        this.courses = courses;
        this.answers = answers;
        this.results = results;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public QuizzUserType getQuizzUserType() {
        return quizzUserType;
    }

    public void setQuizzUserType(QuizzUserType quizzUserType) {
        this.quizzUserType = quizzUserType;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public List<Alternative> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Alternative> answers) {
        this.answers = answers;
    }

    public List<QuizzResult> getResults() {
        return results;
    }

    public void setResults(List<QuizzResult> results) {
        this.results = results;
    }
}
