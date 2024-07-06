package com.question.service.Impl;

import com.question.entity.Quention;
import com.question.repository.QuestionRespository;
import com.question.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class QuestionImpl implements QuestionService {

    @Autowired
    private QuestionRespository questionRespository;

    public QuestionImpl(QuestionRespository questionRespository) {
        this.questionRespository = questionRespository;
    }

    @Override
    public Quention create(Quention quention) {
        return questionRespository.save(quention);
    }

    @Override
    public List<Quention> get() {
        return questionRespository.findAll();
    }

    @Override
    public Quention getOne(Long id) {
        return questionRespository.findById(id).orElseThrow(() -> new RuntimeException("Question Not Found"));
    }

    @Override
    public List<Quention> getQuestionsOfQuiz(Long quizId) {
        return questionRespository.findByQuizId(quizId);
    }
}