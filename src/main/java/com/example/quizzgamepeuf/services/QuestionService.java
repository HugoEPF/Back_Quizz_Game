package com.example.quizzgamepeuf.services;

import com.example.quizzgamepeuf.DAO.QuestionDao;
import com.example.quizzgamepeuf.models.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class QuestionService {
    @Autowired
    private QuestionDao questionDao;
    public List<Question> findAll() {
        Iterable<Question> it = questionDao.findAll();
        List<Question> questions = new ArrayList<>();
        it.forEach(questions::add);
        return questions;
    }

    public List<Question> findQuestionsByGenre(String genre) {
        Iterable<Question> it = questionDao.findQuestionsByGenre(genre);
        List<Question> question_genre = new ArrayList<>();
        it.forEach(question_genre::add);
        return question_genre;
    }

    public List<Question> findQuestionsById(Long id) {
        Iterable<Question> it = questionDao.findQuestionsById(id);
        List<Question> question_id = new ArrayList<>();
        it.forEach(question_id::add);
        return question_id;
    }
}
