package com.example.quizzgamepeuf.DAO;

import com.example.quizzgamepeuf.models.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AdminDao extends JpaRepository<Admin, Long> {

    // Enregistre un administrateur dans la base de données
    Admin save(Admin admin);

    // Supprime un administrateur par ID
    void deleteById(Long id);

    // Recherche un administrateur par ID
    @Query("SELECT a FROM Admin a WHERE a.id = :id")
    Optional<Admin> findById(Long id);

    // Recherche un administrateur par adresse e-mail
    @Query("SELECT a FROM Admin a WHERE a.email = :mail")
    Optional<Admin> findByMail(String mail);

}
