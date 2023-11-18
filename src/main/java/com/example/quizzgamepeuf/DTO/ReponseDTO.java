package com.example.quizzgamepeuf.DTO;

import com.example.quizzgamepeuf.models.Question;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Builder
@Getter
public class ReponseDTO {
    private String contenu;
    private boolean isGood;
    private Question question;

}
