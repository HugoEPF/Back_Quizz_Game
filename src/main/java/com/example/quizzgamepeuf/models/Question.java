package com.example.quizzgamepeuf.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;

import java.util.List;

//Même Principe que pour Admin sur les annotations
@Entity
@Table(name= "question")
@Getter
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "question_id_seq")
    private Long id;
    private String contenu;
    private String genre;

    // Précise la relation dans la bdd. Le cascade permet d'effectuer des opérations sur les class enfants.
    @OneToMany(mappedBy = "question", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Reponse> reponses;

    //On précise la relation dans la bdd
    @ManyToOne
    @JoinColumn(name = "quizz_id")
    private Quizz quizz;

    //On définit les getter et setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public List<Reponse> getReponses() {
        return reponses;
    }

    public void setReponses(List<Reponse> reponses) {
        this.reponses = reponses;
    }

    public Quizz getQuizz() {
        return quizz;
    }

    public void setQuizz(Quizz quizz) {
        this.quizz = quizz;
    }


    //On créé un builder
    private Question(Question.Builder builder) {
        this.id = builder.id;
        this.contenu = builder.contenu;
        this.genre = builder.genre;
        this.reponses = builder.reponses;
        this.quizz = builder.quizz;

    }
    public Question() {
    }

    public static class Builder {
        private Long id;
        private String contenu;
        private String genre;
        private List<Reponse> reponses;

        private Quizz quizz;

        public Question.Builder id (Long id) {
            this.id = id;
            return this;
        }
        public Question.Builder contenu(String contenu) {
            this.contenu = contenu;
            return this;
        }
        public Question.Builder genre(String genre) {
            this.genre = genre;
            return this;
        }

        public Question.Builder reponses(List<Reponse> reponses) {
            this.reponses = reponses;
            return this;
        }

        public Question.Builder quizz(Quizz quizz){
            this.quizz = quizz;
            return this;
        }
        public Question build() {
            return new Question(this);
        }
    }
}

