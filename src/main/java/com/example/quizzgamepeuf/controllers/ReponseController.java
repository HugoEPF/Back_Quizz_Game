package com.example.quizzgamepeuf.controllers;


import com.example.quizzgamepeuf.models.Reponse;
import com.example.quizzgamepeuf.services.ReponseService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RequestMapping("reponses")
@RestController
@RequiredArgsConstructor
public class ReponseController {
    @Autowired
    private ReponseService reponseService;

    // Récupère toutes les réponses
    @GetMapping("")
    public List<Reponse> listReponse() {
        return reponseService.findAll();
    }

    // Récupère les réponses pour une question spécifique par ID
    @GetMapping("{id}")
    public List<Reponse> listReponseQuestionId(@PathVariable Long id) {
        return reponseService.findByReponseQuestionId(id);
    }

    // Récupère une réponse par ID
    @GetMapping("byId/{id}")
    public Optional<Reponse> findQById(@PathVariable Long id){
        return reponseService.findById(id);
    }


    // Récupère les réponses par statut "isGood"
    @GetMapping("isGood/{isgood}")
    public List<Reponse> listReponseQuestionId(@PathVariable Boolean isgood) {
        return reponseService.findByTrueAnswer(isgood);
    }

    // Crée une nouvelle réponse
    @PostMapping
    public Reponse createReponse(@RequestBody Reponse reponse){
        return reponseService.create(reponse);
    }

    // Supprime une réponse par ID
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteReponse(@PathVariable Long id) {
        reponseService.deleteById(id);
        return ResponseEntity.ok("Reponse deleted successfully");
    }
}
