package com.example.quizzgamepeuf.controllers;

import com.example.quizzgamepeuf.models.Question;
import com.example.quizzgamepeuf.services.QuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RequestMapping("questions")
@RestController
@RequiredArgsConstructor
public class QuestionController {
    @Autowired
    private QuestionService questionService;

    // Récupère toutes les questions
    @GetMapping("")
    public List<Question> listQuestion() {
        return questionService.findAll();
    }

    // Récupère les questions par genre
    @GetMapping("byGenre/{genre}")
    public List<Question> findQuestionsByGenre(@PathVariable String genre){
        return questionService.findQuestionsByGenre(genre);
    }

    // Récupère une liste de questions associé à un id de quizz
    @GetMapping("byId/{id}")
    public List<Question> findQuestionsById(@PathVariable Long id){
        return questionService.findQuestionsById(id);
    }

    // Récupère une question par ID
    @GetMapping("{id}")
    public Optional<Question> findQById(@PathVariable Long id){
        return questionService.findById(id);
    }

    // Crée une nouvelle question
    @PostMapping
    public Question CreateQuestion(@RequestBody Question question){
        return questionService.create(question);
    }

    // Supprime une question par ID
    @DeleteMapping("/{questionId}")
    public ResponseEntity<String> deleteQuestion(@PathVariable Long questionId) {
        questionService.deleteById(questionId);
        return ResponseEntity.ok("Question deleted successfully");
    }
}
