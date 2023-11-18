package com.example.quizzgamepeuf.services;

import com.example.quizzgamepeuf.DAO.QuestionDao;
import com.example.quizzgamepeuf.DAO.QuizzDao;
import com.example.quizzgamepeuf.models.Question;
import com.example.quizzgamepeuf.models.Quizz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class QuizzService {
    @Autowired
    private QuizzDao quizzDao;

    public List<Quizz> findAll() {
        Iterable<Quizz> it = quizzDao.findAll();
        List<Quizz> quizz = new ArrayList<>();
        it.forEach(quizz::add);
        return quizz;
    }

}
