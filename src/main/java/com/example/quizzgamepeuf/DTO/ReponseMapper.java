package com.example.quizzgamepeuf.DTO;

import com.example.quizzgamepeuf.models.Quizz;
import com.example.quizzgamepeuf.models.Reponse;

import java.io.IOException;

public class ReponseMapper {
    public static Reponse fromDto(Reponse dto, Long id) throws IOException {
        return new Reponse.Builder()
                .id(id)
                .contenu(dto.getContenu())
                .isgood(dto.isIsgood())
                .question(dto.getQuestion())
                .build();
    }

    public static ReponseDTO toDto (Reponse reponse){
        return ReponseDTO.builder()
                .contenu(reponse.getContenu())
                .isGood(reponse.isIsgood())
                .question(reponse.getQuestion())
                .build();
    }
}
