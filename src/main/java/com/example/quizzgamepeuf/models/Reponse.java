package com.example.quizzgamepeuf.models;

import jakarta.persistence.*;
import lombok.Getter;

/*@Entity
@Table(name= "reponse")
@Getter*/
public class Reponse {
   /* @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "contenu")
    private String contenu;

    @Column(name = "isGood")
    private boolean isGood;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "question_id")
    private Question question;

    private Reponse(Builder builder) {
        this.id = builder.id;
        this.contenu = builder.contenu;
        this.isGood = builder.isGood;
        this.question = builder.question;
    }

    public Reponse() {
    }

    public static class Builder {
        private Long id;
        private String contenu;
        private boolean isGood;
        private Question question;


        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder contenu(String contenu) {
            this.contenu = contenu;
            return this;
        }

        public Builder isGood(boolean isGood) {
            this.isGood = isGood;
            return this;
        }

        public Builder question(Question question) {
            this.question = question;
            return this;
        }
        public Reponse build() {
            return new Reponse(this);
        }
    }*/

    }


