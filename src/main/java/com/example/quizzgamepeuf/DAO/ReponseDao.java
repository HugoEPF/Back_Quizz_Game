package com.example.quizzgamepeuf.DAO;

import com.example.quizzgamepeuf.models.Reponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
    public interface ReponseDao extends JpaRepository<Reponse, Long> {
        @Query("SELECT r FROM Reponse r WHERE r.question.id = :questionId")
        List<Reponse> findByReponseQuestionId(@Param("questionId") Long questionId);


        @Query("SELECT r FROM Reponse r WHERE r.isgood = :isgood")
        List<Reponse> findByTrueReponse(@Param("isgood") Boolean isgood);
    }



