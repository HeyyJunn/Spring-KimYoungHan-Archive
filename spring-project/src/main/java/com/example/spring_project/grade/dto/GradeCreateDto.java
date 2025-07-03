package com.example.spring_project.grade.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GradeCreateDto {
    @NotBlank(message = "required")
    private String name;
    @NotBlank(message = "required")
    private String studentNumber;
    @NotBlank(message = "required")
    private int score;

    // 새로 추가
    @NotBlank(message = "메모 내용을 입력해주세요.")
    private String noteContent;
}
