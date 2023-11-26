package com.example.quizzgamepeuf.DTO;

import com.example.quizzgamepeuf.models.Question;
import lombok.Builder;
import lombok.Getter;

import java.util.List;
@Builder
@Getter
public class QuizzDto {
    private String genre;
    private List<Question> questions;
}