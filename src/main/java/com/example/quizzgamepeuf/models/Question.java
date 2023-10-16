package com.example.quizzgamepeuf.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name= "question")
@Getter
@NoArgsConstructor
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String contenu;
    private String genre;
    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "quizz_id")
    private Quizz quizz;

    private Question(Question.Builder builder) {
        this.id = builder.id;
        this.contenu = builder.contenu;
        this.genre = builder.genre;
        this.quizz = builder.quizz;
    }
    public Question() {
    }

    public static class Builder {
        private Long id;
        private String contenu;
        private String genre;
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
        public Question.Builder quizz(Quizz quizz) {
            this.quizz = quizz;
            return this;
        }
        public Question build() {
            return new Question(this);
        }
    }
}

