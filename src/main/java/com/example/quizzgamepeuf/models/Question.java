package com.example.quizzgamepeuf.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name= "question")
@Getter
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "question_id_seq")
    private Long id;
    private String contenu;
    private String genre;

    @OneToMany(mappedBy = "reponse")
    @JsonIgnore
    private List<Reponse> reponses;

    private Question(Question.Builder builder) {
        this.id = builder.id;
        this.contenu = builder.contenu;
        this.genre = builder.genre;
        this.reponses = builder.reponses;

    }
    public Question() {
    }

    public static class Builder {
        private Long id;
        private String contenu;
        private String genre;
        private List<Reponse> reponses;

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
        public Question build() {
            return new Question(this);
        }
    }
}

