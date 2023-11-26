package com.example.quizzgamepeuf.controllers;

import com.example.quizzgamepeuf.models.Quizz;
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

    // Récupère tous les quiz
    @GetMapping("")
    public List<Quizz> quizzes() {
        return quizzService.findAll();
    }

    // Récupère un quiz par ID
    @GetMapping("/{id}")
    public Optional<Quizz> findById(@PathVariable Long id){
        return quizzService.findById(id);
    }

    // Crée un nouveau quiz
    @PostMapping
    public Quizz CreateQuizz(@RequestBody Quizz quizz){
        return quizzService.create(quizz);
    }

    // Supprime un quiz par ID
    @DeleteMapping("/{quizzId}")
    public ResponseEntity<String> deleteQuizz(@PathVariable Long quizzId) {
        quizzService.deleteById(quizzId);
        return ResponseEntity.ok("Quizz deleted successfully");
    }
}
