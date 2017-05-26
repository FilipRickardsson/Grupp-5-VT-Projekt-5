/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quizztool.quizztoolbackend.models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author Dhiaa Eddin Anabtawi
 */
@Entity
public class Quizz implements Serializable{
    
    @Id
    @GeneratedValue
    
    private int id;
    private String name;
    private boolean showResult;

    public Quizz() {
    }

    public Quizz(int id, String name, boolean showResult) {
        this.id = id;
        this.name = name;
        this.showResult = showResult;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    
    
}
