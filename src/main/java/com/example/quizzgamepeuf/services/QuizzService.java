package com.example.quizzgamepeuf.services;

import com.example.quizzgamepeuf.DAO.QuizzDao;
import com.example.quizzgamepeuf.models.Quizz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class QuizzService {
    @Autowired
    private QuizzDao quizzDao;

    //On appelle la méthode findAll du Dao pour trouver tous les quizz
    public List<Quizz> findAll() {
        Iterable<Quizz> it = quizzDao.findAll();
        List<Quizz> quizz = new ArrayList<>();
        it.forEach(quizz::add);
        return quizz;
    }

    //On appelle la méthode findById du Dao pour trouver un quizz par son id
    public Optional<Quizz> findById(Long id){
        return  quizzDao.findById(id);
    }

    //On appelle la méthode save du Dao pour créer un quizz
    public Quizz create(Quizz quizz) {
        return quizzDao.save(quizz);
    }

    //On appelle la méthode delete du Dao pour supprimer un quiz
    public void deleteById(Long id){
        quizzDao.deleteById(id);
    }

}
