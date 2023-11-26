package com.example.quizzgamepeuf.services;

import com.example.quizzgamepeuf.DAO.QuizzDao;
import com.example.quizzgamepeuf.DTO.QuizzDto;
import com.example.quizzgamepeuf.DTO.QuizzMapper;
import com.example.quizzgamepeuf.models.Quizz;
import com.example.quizzgamepeuf.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

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

    public Optional<Quizz> findById(Long id){
        return  quizzDao.findById(id);
    }
    public Quizz create(Quizz quizz) {
        return quizzDao.save(quizz);
    }

    public void deleteById(Long id){
        quizzDao.deleteById(id);
    }

}
