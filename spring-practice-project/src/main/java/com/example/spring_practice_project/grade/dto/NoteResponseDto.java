package com.example.spring_project.grade.dto;

import com.example.spring_project.grade.domain.GradeNote;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
public class NoteResponseDto {
    private Long id;
    private String content;
    private LocalDateTime createTime;

    public static NoteResponseDto fromEntity(GradeNote n) {
        return new NoteResponseDto(
                n.getId(),
                n.getContent(),
                n.getCreateDate()
        );
    }
}