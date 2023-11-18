package com.example.quizzgamepeuf.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.List;

@Entity
@Getter
@Table(name= "quizz")
public class Quizz {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer nombre_questions;
    private String genre;

    private Quizz(Builder builder) {
        this.id = builder.id;
        this.nombre_questions = builder.nombre_questions;
        this.genre = builder.genre;
    }
    public Quizz() {
    }

    public static class Builder {
        private Long id;
        private Integer nombre_questions;
        private String genre;

        public Builder id (Long id) {
            this.id = id;
            return this;
        }
        public Builder nombre_questions(Integer nombre_questions) {
            this.nombre_questions = nombre_questions;
            return this;
        }
        public Builder genre(String genre) {
            this.genre = genre;
            return this;
        }
        public Quizz build() {
            return new Quizz(this);
        }
    }
}


