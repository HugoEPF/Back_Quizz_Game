package com.example.quizzgamepeuf.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;


//Même chose que pour admin pour les annotations
@Entity
@Getter
@NoArgsConstructor
@Table(name= "utilisateur")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator="utilisateur_id_seq")
    @Column
    private Long id;
    @Column
    private String pseudo;
    @Column
    private String email;
    @Column
    private Integer score;
}

