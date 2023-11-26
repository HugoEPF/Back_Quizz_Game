package com.example.quizzgamepeuf.DAO;

import com.example.quizzgamepeuf.models.Reponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReponseDao extends JpaRepository<Reponse, Long> {

    // Enregistre une réponse dans la base de données
    Reponse save(Reponse reponse);

    // Recherche des réponses pour une question spécifique par ID
    @Query("SELECT r FROM Reponse r WHERE r.question.id = :questionId")
    List<Reponse> findByReponseQuestionId(@Param("questionId") Long questionId);

    // Supprime une réponse par ID
    void deleteById(Long id);

    // Recherche des réponses par statut "isGood"
    @Query("SELECT r FROM Reponse r WHERE r.isgood = :isgood")
    List<Reponse> findByTrueReponse(@Param("isgood") Boolean isgood);
}



