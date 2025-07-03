package com.example.spring_project.member.repository;

import com.example.spring_project.member.domain.Member;

import java.util.List;

public interface MemberRepository {
    Member save(Member member); //
//    Optional<Member> findById(Long id);
//    Optional<Member> findByName(String name);
    List<Member> findAll();
}
