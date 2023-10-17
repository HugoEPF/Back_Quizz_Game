package com.example.quizzgamepeuf.models;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Reponse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "contenu")
    private String contenu;

    @Column(name = "isGood")
    private boolean isGood;

    @Column(name = "question_id")
    private Long question_id;

    private Reponse(Reponse.Builder builder) {
        this.id = builder.id;
        this.contenu = builder.contenu;
        this.isGood = builder.isGood;
        this.question_id = builder.question_id;
    }

    public Reponse() {
    }

    public static class Builder {
        private Long id;
        private String contenu;
        private boolean isGood;
        private Long question_id;

    }

    public Reponse id (Long id) {
        this.id = id;
        return this;
    }

    public Reponse contenu (String contenu) {
        this.contenu = contenu;
        return this;
    }

    public Reponse isGood (boolean isGood) {
        this.isGood = isGood;
        return this;
    }

    public Reponse question_id (Long question_id) {
        this.question_id = question_id;
        return this;
    }

    }


