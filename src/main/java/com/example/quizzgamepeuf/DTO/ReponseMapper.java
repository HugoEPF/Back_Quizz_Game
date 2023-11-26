package com.example.quizzgamepeuf.DTO;

import com.example.quizzgamepeuf.models.Reponse;

import java.io.IOException;

public class ReponseMapper {

    // Convertit un objet ReponseDto en objet Reponse en spécifiant l'identifiant (id)
    public static Reponse fromDto(Reponse dto, Long id) throws IOException {
        return new Reponse.Builder()
                .id(id)
                .contenu(dto.getContenu())
                .isgood(dto.isIsgood())
                .question(dto.getQuestion())
                .build();
    }

    // Convertit un objet Reponse en objet ReponseDto
    public static ReponseDTO toDto (Reponse reponse){
        return ReponseDTO.builder()
                .contenu(reponse.getContenu())
                .isGood(reponse.isIsgood())
                .question(reponse.getQuestion())
                .build();
    }
}
