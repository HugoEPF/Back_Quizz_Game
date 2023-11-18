package com.example.quizzgamepeuf.DAO;

import com.example.quizzgamepeuf.models.Question;
import com.example.quizzgamepeuf.models.Quizz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface QuizzDao extends JpaRepository<Quizz,Long> {
}


