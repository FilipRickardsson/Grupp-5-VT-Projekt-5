package com.quizztool.quizztoolbackend.models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class QuizzUser implements Serializable {

    @Id
    @GeneratedValue
    private int id;
    private String username;

    public QuizzUser() {
    }

    public QuizzUser(int id, String username) {
        this.id = id;
        this.username = username;
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

}
