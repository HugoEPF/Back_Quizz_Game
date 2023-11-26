package com.example.quizzgamepeuf.DAO;

import com.example.quizzgamepeuf.models.Quizz;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
public interface QuizzDao extends JpaRepository<Quizz,Long> {


    Quizz save(Quizz quizz);

    void deleteById(Long id);
    @Query("SELECT q FROM Quizz q WHERE q.id = :id")
    Optional<Quizz> findById(Long id);
}


