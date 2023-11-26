package com.example.quizzgamepeuf.DTO;

import com.example.quizzgamepeuf.models.Quizz;

import java.io.IOException;

public class QuizzMapper {

    // Convertit un objet QuizzDto en objet Quizz en spécifiant l'identifiant (id)
    public static Quizz fromDto(QuizzDto dto, Long id) throws IOException {
        return new Quizz.Builder()
                .id(id)
                .genre(dto.getGenre())
                .questions(dto.getQuestions())
                .build();
    }
    // Convertit un objet Quizz en objet QuizzDto
    public static QuizzDto toDto (Quizz quizz){
        return QuizzDto.builder()
                .genre(quizz.getGenre())
                .questions(quizz.getQuestions())
                .build();
    }
}
