package com.example.quizzgamepeuf.DAO;

import com.example.quizzgamepeuf.models.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
    public interface QuestionDao extends JpaRepository<Question, Long> {
    @Query("SELECT q FROM Question q WHERE q.genre = :genre")
    List<Question> findIdByGenre(@Param("genre") String genre);

    Question save(Question question);

    void deleteById(Long id);
    List<Question> findQuestionsByGenre(@Param("genre") String genre);

    @Query("SELECT q FROM Question q WHERE q.id = :id")
    List<Question> findQuestionsById(@Param("id") Long id);
}
