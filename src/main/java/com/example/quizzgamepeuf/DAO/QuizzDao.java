package com.example.quizzgamepeuf.DAO;

import com.example.quizzgamepeuf.models.Quizz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuizzDao extends JpaRepository<Quizz,Long> {

    Quizz save(Quizz quizz);

    void deleteById(Long id);
}


