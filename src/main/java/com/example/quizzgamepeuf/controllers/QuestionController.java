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
    @GetMapping("")
    public List<Question> listQuestion() {
        return questionService.findAll();
    }

    @GetMapping("{genre}/{id}")
    public List<Question> listQuestionByGenreId(@PathVariable String genre, @PathVariable Long id){
        return questionService.searchQuestionByQuizzGenreId(genre, id);
        }

    @GetMapping("{genre}")
    public List<Question> findIdByGenre(@PathVariable String genre){
        return questionService.findIdByGenre(genre);
    }

}
