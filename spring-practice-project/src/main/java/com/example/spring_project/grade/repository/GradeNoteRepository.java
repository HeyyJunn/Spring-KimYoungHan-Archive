package com.example.spring_project.grade.repository;

import com.example.spring_project.grade.domain.GradeNote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GradeNoteRepository extends JpaRepository<GradeNote, Long> {
}
