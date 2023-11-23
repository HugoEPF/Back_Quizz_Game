package com.example.quizzgamepeuf.services;

import com.example.quizzgamepeuf.DAO.QuestionDao;
import com.example.quizzgamepeuf.DAO.ReponseDao;
import com.example.quizzgamepeuf.models.Question;
import com.example.quizzgamepeuf.models.Reponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service

public class ReponseService {
    @Autowired
    private ReponseDao reponseDao;

    public List<Reponse> findAll() {
        Iterable<Reponse> it = reponseDao.findAll();
        List<Reponse> reponse = new ArrayList<>();
        it.forEach(reponse::add);
        return reponse;
    }

    public List<Reponse> findByReponseQuestionId(Long id) {
        Iterable<Reponse> it = reponseDao.findByReponseQuestionId(id);
        List<Reponse> reponse = new ArrayList<>();
        it.forEach(reponse::add);
        return reponse;
    }

    public List<Reponse> findByTrueAnswer(Boolean isgood) {
        Iterable<Reponse> it = reponseDao.findByTrueReponse(isgood);
        List<Reponse> reponse = new ArrayList<>();
        it.forEach(reponse::add);
        return reponse;
    }
}
