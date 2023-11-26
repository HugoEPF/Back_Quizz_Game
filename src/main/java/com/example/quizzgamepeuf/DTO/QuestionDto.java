package com.example.quizzgamepeuf.DTO;

import com.example.quizzgamepeuf.models.Question;
import com.example.quizzgamepeuf.models.Quizz;
import com.example.quizzgamepeuf.models.Reponse;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Builder
@Getter
public class QuestionDto {
    private Long id;
    private String contenu;
    private String genre;
    private List<Reponse> reponses;
    private Quizz quizz;

}