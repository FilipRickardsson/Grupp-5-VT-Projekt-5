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
public class Course implements Serializable {

    @Id
    @GeneratedValue
    private int id;
    private String name;

    @ManyToMany
    @JsonManagedReference
    private List<Quizz> quizzes;

    @ManyToMany
    @JsonBackReference
    private List<QuizzUser> quizzUsers;

    public Course() {
    }

    public Course(String name, List<Quizz> quizzes, List<QuizzUser> quizzUsers) {
        this.name = name;
        this.quizzes = quizzes;
        this.quizzUsers = quizzUsers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Quizz> getQuizzes() {
        return quizzes;
    }

    public void setQuizzes(List<Quizz> quizzes) {
        this.quizzes = quizzes;
    }

    public void setQuizzUsers(List<QuizzUser> quizzUsers) {
        this.quizzUsers = quizzUsers;
    }

    @Override
    public String toString() {
        return "Course{" + "id=" + id + ", name=" + name + ", quizzes=" + quizzes + '}';
    }
    
}
