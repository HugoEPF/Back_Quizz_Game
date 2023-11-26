package com.example.quizzgamepeuf.controllers;

import com.example.quizzgamepeuf.DTO.QuizzDto;
import com.example.quizzgamepeuf.models.Quizz;
import com.example.quizzgamepeuf.models.User;
import com.example.quizzgamepeuf.services.QuizzService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @GetMapping("/{id}")
    public Optional<Quizz> findById(@PathVariable Long id){
        return quizzService.findById(id);
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
