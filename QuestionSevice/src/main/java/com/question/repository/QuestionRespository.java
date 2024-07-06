package com.question.repository;

import com.question.entity.Quention;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestionRespository extends JpaRepository<Quention, Long> {

    List<Quention> findByQuizId(Long quizId);
}