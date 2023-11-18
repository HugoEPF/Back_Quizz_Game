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

    public List<Question> searchQuestionByQuizzGenreId(String genre, Long id) {
        Iterable<Question> it = questionDao.findQuestionByQuizzGenreId(genre, id);
        List<Question> question_quizz = new ArrayList<>();
        it.forEach(question_quizz::add);
        return question_quizz;
    }

    public List<Question> findIdByGenre(String genre) {
        Iterable<Question> it = questionDao.findIdByGenre(genre);
        List<Question> question_id = new ArrayList<>();
        it.forEach(question_id::add);
        return question_id;
    }
}
