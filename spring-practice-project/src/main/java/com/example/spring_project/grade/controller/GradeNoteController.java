package com.example.spring_project.grade.controller;

import com.example.spring_project.grade.domain.Grade;
import com.example.spring_project.grade.domain.GradeNote;
import com.example.spring_project.grade.dto.GradeCreateDto;
import com.example.spring_project.grade.dto.GradeResponseDto;
import com.example.spring_project.grade.dto.NoteCreateDto;
import com.example.spring_project.grade.dto.NoteResponseDto;
import com.example.spring_project.grade.service.GradeNoteService;
import com.example.spring_project.grade.service.GradeService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/grades/{contactId}/notes")
@RequiredArgsConstructor
public class GradeNoteController {

    private final GradeNoteService noteService;

    @PostMapping
    public NoteResponseDto addNote(
            @PathVariable Long contactId,
            @RequestBody @Valid NoteCreateDto dto) {

        GradeNote saved = noteService.createNote(contactId, dto.getContent());
        return NoteResponseDto.fromEntity(saved);
    }
}