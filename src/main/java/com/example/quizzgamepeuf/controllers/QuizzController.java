package com.example.quizzgamepeuf.controllers;

import com.example.quizzgamepeuf.models.Quizz;
import com.example.quizzgamepeuf.services.QuizzService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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

    @PostMapping
    public Quizz CreateQuizz(@RequestBody Quizz quizz){
        return quizzService.create(quizz);
    }

    @DeleteMapping("/{quizzId}")
    public ResponseEntity<String> deleteQuizz(@PathVariable Long quizzId) {
        quizzService.deleteById(quizzId);
        return ResponseEntity.ok("Quizz deleted successfully");
    }
}
