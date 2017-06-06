package com.quizztool.quizztoolbackend.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
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

    @OneToMany(mappedBy = "quizzUser")
    @JsonBackReference
    @JsonIgnore
    private List<QuizzResult> results;

    public QuizzUser() {
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

    public void setResults(List<QuizzResult> results) {
        this.results = results;
    }

    @Override
    public String toString() {
        return "QuizzUser{" + "id=" + id + ", username=" + username + ", password=" + password + ", quizzUserType=" + quizzUserType + ", courses=" + courses + ", results=" + results + '}';
    }

}
