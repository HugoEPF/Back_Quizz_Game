package com.example.quizzgamepeuf.services;

import com.example.quizzgamepeuf.DAO.ReponseDao;
import com.example.quizzgamepeuf.models.Reponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service

public class ReponseService {
    @Autowired
    private ReponseDao reponseDao;

    //On appelle la méthode findAll du dao pour trouver toutes les réponses
    public List<Reponse> findAll() {
        Iterable<Reponse> it = reponseDao.findAll();
        List<Reponse> reponse = new ArrayList<>();
        it.forEach(reponse::add);
        return reponse;
    }

    //On appelle la méthode du dao pour trouver les réponses associés à une question
    public List<Reponse> findByReponseQuestionId(Long id) {
        Iterable<Reponse> it = reponseDao.findByReponseQuestionId(id);
        List<Reponse> reponse = new ArrayList<>();
        it.forEach(reponse::add);
        return reponse;
    }

    //On appelle le dao pour trouver les réponses par le paramètre isgood
    public List<Reponse> findByTrueAnswer(Boolean isgood) {
        Iterable<Reponse> it = reponseDao.findByTrueReponse(isgood);
        List<Reponse> reponse = new ArrayList<>();
        it.forEach(reponse::add);
        return reponse;
    }

    //On appelle le dao pour trouver une réponse par son id
    public Optional<Reponse> findById(Long id){
        return  reponseDao.findById(id);
    }

    //On appelle le dao pour supprimer une réponse
    public void deleteById(Long id){
        reponseDao.deleteById(id);
    }

    //On appelle le dao pour créer une réponse
    public Reponse create(Reponse reponse){
        return reponseDao.save(reponse);
    }
}
