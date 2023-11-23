package com.example.quizzgamepeuf.controllers;

import com.example.quizzgamepeuf.models.Question;
import com.example.quizzgamepeuf.services.QuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RequestMapping("questions")
@RestController
@RequiredArgsConstructor
public class QuestionController {
    @Autowired
    private QuestionService questionService;
    @GetMapping("all")
    public List<Question> listQuestion() {
        return questionService.findAll();
    }


    @GetMapping("byGenre/{genre}")
    public List<Question> findQuestionsByGenre(@PathVariable String genre){
        return questionService.findQuestionsByGenre(genre);
    }

    @GetMapping("byId/{id}")
    public List<Question> findQuestionsById(@PathVariable Long id){
        return questionService.findQuestionsById(id);
    }

    @PostMapping
    public Question CreateQuestion(@RequestBody Question question){
        return questionService.create(question);
    }

    @DeleteMapping("/{questionId}")
    public ResponseEntity<String> deleteQuestion(@PathVariable Long questionId) {
        questionService.deleteById(questionId);
        return ResponseEntity.ok("Question deleted successfully");
    }
}
