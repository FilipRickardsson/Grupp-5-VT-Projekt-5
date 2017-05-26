package com.quizztool.quizztoolbackend.models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class QuizzUser implements Serializable {

    @Id
    @GeneratedValue
    private int id;
    private String username;
    private String password;

    @Enumerated(EnumType.STRING)
    private QuizzUserType quizzUserType;

    public QuizzUser() {
    }

    public QuizzUser(int id, String username, String password, QuizzUserType quizzUserType) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.quizzUserType = quizzUserType;
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
    
}
