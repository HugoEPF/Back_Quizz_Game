package com.example.quizzgamepeuf.controllers;

import com.example.quizzgamepeuf.models.Question;
import com.example.quizzgamepeuf.services.QuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
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

}
