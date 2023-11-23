package com.example.quizzgamepeuf.controllers;


import com.example.quizzgamepeuf.models.Question;
import com.example.quizzgamepeuf.models.Reponse;
import com.example.quizzgamepeuf.services.QuestionService;
import com.example.quizzgamepeuf.services.ReponseService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RequestMapping("reponses")
@RestController
@RequiredArgsConstructor
public class ReponseController {
    @Autowired
    private ReponseService reponseService;

    @GetMapping("")
    public List<Reponse> listReponse() {
        return reponseService.findAll();
    }

    @GetMapping("{id}")
    public List<Reponse> listReponseQuestionId(@PathVariable Long id) {
        return reponseService.findByReponseQuestionId(id);
    }

    @GetMapping("isGood/{isgood}")
    public List<Reponse> listReponseQuestionId(@PathVariable Boolean isgood) {
        return reponseService.findByTrueAnswer(isgood);
    }

}
