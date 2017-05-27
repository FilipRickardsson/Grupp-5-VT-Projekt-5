/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quizztool.quizztoolbackend.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import java.util.List;
import javax.persistence.ManyToMany;

/**
 *
 * @author Dhiaa Eddin Anabtawi
 */
public class Course {
    private String name;
    
    @ManyToMany(mappedBy="Quizz")
    @JsonBackReference
    private List<Quizz> quizzes;
    
    @ManyToMany(mappedBy="QuizzUser")
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

    public List<QuizzUser> getQuizzUsers() {
        return quizzUsers;
    }

    public void setQuizzUsers(List<QuizzUser> quizzUsers) {
        this.quizzUsers = quizzUsers;
    }
}
