package com.example.quizzgamepeuf.DTO;

import com.example.quizzgamepeuf.models.Question;
import com.example.quizzgamepeuf.models.Quizz;

import java.io.IOException;

public class QuizzMapper {
    public static Quizz fromDto(Quizz dto, Long id) throws IOException {
        return new Quizz.Builder()
                .id(id)
                .nombre_questions(dto.getNombre_questions())
                .genre(dto.getGenre())
                .build();
    }

    public static QuizzDto toDto (Quizz quizz){
        return QuizzDto.builder()
                .nombre_questions(quizz.getNombre_questions())
                .genre(quizz.getGenre())
                .build();
    }
}
