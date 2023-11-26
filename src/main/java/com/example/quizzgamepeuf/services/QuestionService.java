package com.example.quizzgamepeuf.services;

import com.example.quizzgamepeuf.DAO.QuestionDao;
import com.example.quizzgamepeuf.models.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class QuestionService {
    @Autowired
    private QuestionDao questionDao;

    //On appelle la méthode findAll du dao pour trouver toutes les questions
    public List<Question> findAll() {
        Iterable<Question> it = questionDao.findAll();
        List<Question> questions = new ArrayList<>();
        it.forEach(questions::add);
        return questions;
    }

    //On appelle la méthode findQuestionsByGenre du Dao pour trouver les questions reliés à un genre
    public List<Question> findQuestionsByGenre(String genre) {
        Iterable<Question> it = questionDao.findQuestionsByGenre(genre);
        List<Question> question_genre = new ArrayList<>();
        it.forEach(question_genre::add);
        return question_genre;
    }

    //On appelle la méthode findQuestionsById du Dao pour trouver les questions reliés à un id de quizz
    public List<Question> findQuestionsById(Long id) {
        Iterable<Question> it = questionDao.findQuestionsById(id);
        List<Question> question_id = new ArrayList<>();
        it.forEach(question_id::add);
        return question_id;
    }

    //On appelle la méthode findById du Dao pour trouver une question par id
    public Optional<Question> findById(Long id){
        return  questionDao.findById(id);
    }

    //On appelle la méthode save du Dao pour créer une question
    public Question create(Question question) {
        return questionDao.save(question);
    }

    //On appelle la méthode delete du Dao pour supprimer une question
    public void deleteById(Long id){
        questionDao.deleteById(id);
    }
}
