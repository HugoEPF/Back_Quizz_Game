package com.example.quizzgamepeuf.models;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Table(name= "reponse")
@Getter
public class Reponse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "reponse_id_seq")
    private Long id;
    private String contenu;
    private boolean isgood;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "question_id")
    private Question question;

    private Reponse(Builder builder) {
        this.id = builder.id;
        this.contenu = builder.contenu;
        this.isgood = builder.isgood;
        this.question = builder.question;
    }

    public Reponse() {
    }

    public static class Builder {
        private Long id;
        private String contenu;
        private Boolean isgood;
        private Question question;


        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder contenu(String contenu) {
            this.contenu = contenu;
            return this;
        }

        public Builder isgood(boolean isgood) {
            this.isgood = isgood;
            return this;
        }

        public Builder question(Question question) {
            this.question = question;
            return this;
        }
        public Reponse build() {
            return new Reponse(this);
        }
    }

    }


