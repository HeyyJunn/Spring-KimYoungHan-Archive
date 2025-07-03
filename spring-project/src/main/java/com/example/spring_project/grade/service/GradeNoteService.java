package com.example.spring_project.grade.service;

import com.example.spring_project.grade.domain.Grade;
import com.example.spring_project.grade.domain.GradeNote;
import com.example.spring_project.grade.dto.GradeCreateDto;
import com.example.spring_project.grade.repository.GradeNoteRepository;
import com.example.spring_project.grade.repository.SpringDataJpaGradeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class GradeNoteService {

    private final SpringDataJpaGradeRepository gradeRepository;
    private final GradeNoteRepository gradeNoteRepository;

    public GradeNote createNote(Long gradeId, String content) {
        // 1) 해당 Grade 존재 여부 확인
        Grade grade = gradeRepository.findById(gradeId)
                .orElseThrow(() -> new IllegalArgumentException("Grade not found: " + gradeId));

        // 2) GradeNote 생성 및 연관관계 설정
        GradeNote gradeNote = new GradeNote();
        gradeNote.setContent(content);
        gradeNote.setCreateDate(LocalDateTime.now());
        gradeNote.setGrade(grade);  // 연관관계 설정

        // 3) 저장 후 반환
        return gradeNoteRepository.save(gradeNote);
    }
}