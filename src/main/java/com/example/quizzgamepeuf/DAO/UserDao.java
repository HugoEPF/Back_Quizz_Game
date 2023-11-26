package com.example.quizzgamepeuf.DAO;

import com.example.quizzgamepeuf.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserDao extends JpaRepository<User, Long> {

    // Enregistre un utilisateur dans la base de données
    User save(User user);

    // Supprime un utilisateur par ID
    void deleteById(Long id);

    // Recherche un utilisateur par ID
    @Query("SELECT u FROM User u WHERE u.id = :id")
    Optional<User> findById(Long id);

    // Recherche un utilisateur par adresse e-mail
    @Query("SELECT u FROM User u WHERE u.email = :mail")
    Optional<User> findByMail(String mail);
}
