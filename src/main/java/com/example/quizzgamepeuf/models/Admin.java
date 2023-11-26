package com.example.quizzgamepeuf.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity // Indique que cette classe est une entité JPA
@Getter // Lombok génère automatiquement les méthodes getters
@NoArgsConstructor // Lombok génère automatiquement un constructeur sans arguments
@Table(name = "admin") // Spécifie le nom de la table dans la base de données
public class Admin {
    // Indique que cette propriété est la clé primaire de l'entité
    @Id
    // Génère automatiquement la valeur de la clé primaire
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "admin_id_seq")
    //Les annotations Column précise que la propriété est une colonne de la base de données
    @Column
    private Long id;
    @Column
    private String nom;
    @Column
    private String prenom;
    @Column
    private String email;
}
