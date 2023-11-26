package com.example.quizzgamepeuf.DAO;

import com.example.quizzgamepeuf.models.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
    public interface QuestionDao extends JpaRepository<Question, Long> {



    // Enregistre une question dans la base de données
    Question save(Question question);

    // Supprime une question par ID
    void deleteById(Long id);

    // Recherche des questions par genre
    @Query("SELECT q FROM Question q WHERE q.genre = :genre")
    List<Question> findQuestionsByGenre(@Param("genre") String genre);


    // Recherche des questions par ID
    @Query("SELECT q FROM Question q WHERE q.id = :id")
    List<Question> findQuestionsById(@Param("id") Long id);
}
