package com.example.quizzgamepeuf.controllers;

import com.example.quizzgamepeuf.models.Question;
import com.example.quizzgamepeuf.models.Quizz;
import com.example.quizzgamepeuf.services.QuestionService;
import com.example.quizzgamepeuf.services.QuizzService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RequestMapping("quizz")
@RestController
@RequiredArgsConstructor
public class QuizzController {
    @Autowired
    private QuizzService quizzService;
    @GetMapping("")
    public List<Quizz> quizzes() {
        return quizzService.findAll();
    }

}
