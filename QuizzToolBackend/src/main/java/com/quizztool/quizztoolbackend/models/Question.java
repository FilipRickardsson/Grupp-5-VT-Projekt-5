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
public class Question implements Serializable {

    @Id
    @GeneratedValue
    private int id;
    private String text;

    @ManyToOne
    @JsonBackReference
    private Quizz quizz;

    @OneToMany(mappedBy = "question")
    @JsonManagedReference
    private List<Alternative> alternatives;

    public Question() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setQuizz(Quizz quizz) {
        this.quizz = quizz;
    }

    public void setAlternatives(List<Alternative> alternatives) {
        this.alternatives = alternatives;
    }

    public List<Alternative> getAlternatives() {
        return alternatives;
    }

    @Override
    public String toString() {
        return "Question{" + "id=" + id + ", text=" + text + ", quizz=" + quizz + ", alternatives=" + alternatives + '}';
    }
    
}
