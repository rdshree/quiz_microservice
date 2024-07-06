package com.question.service;

import com.question.entity.Quention;
import java.util.List;

public interface QuestionService {
    Quention create(Quention quention);
    List<Quention> get();
    Quention getOne(Long id);

    List<Quention>getQuestionsOfQuiz(Long quizId);
}
