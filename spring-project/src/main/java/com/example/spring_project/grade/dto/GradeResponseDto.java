package com.example.spring_project.grade.dto;

import com.example.spring_project.grade.domain.Grade;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class GradeResponseDto {
    private Long id;
    private String name;
    private String studentNumber;
    private int score;

    public static GradeResponseDto fromEntity(Grade c) {
        return new GradeResponseDto(
                c.getId(),
                c.getName(),
                c.getStudentNumber(),
                c.getScore()
        );
    }
}
