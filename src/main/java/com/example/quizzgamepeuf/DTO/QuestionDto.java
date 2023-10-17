package com.example.quizzgamepeuf.DTO;

import com.example.quizzgamepeuf.models.Quizz;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class QuestionDto {
    private String contenu;
    private String genre;
    private Quizz quizz;
}