package com.example.quizzgamepeuf.DTO;


import com.example.quizzgamepeuf.models.Question;

import java.io.IOException;

public class QuestionMapper {
    public static Question fromDto(Question dto, Long id) throws IOException {
        return new Question.Builder()
                .id(id)
                .contenu(dto.getContenu())
                .genre(dto.getGenre())
                .build();
    }

    public static QuestionDto toDto (Question question){
        return QuestionDto.builder()
                .contenu(question.getContenu())
                .genre(question.getGenre())
                .build();
    }
}