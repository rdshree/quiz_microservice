package com.quiz.services.impl;

import com.quiz.entity.Quiz;
import com.quiz.repository.QuizRepository;
//import com.quiz.services.QuestionClient;
import com.quiz.services.QuestionClient;
import com.quiz.services.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class QuizServiceImpl implements QuizService {

    private final QuizRepository quizRepository;
    private final QuestionClient questionClient;

    @Autowired
    public QuizServiceImpl(QuizRepository quizRepository, QuestionClient questionClient) {
        this.quizRepository = quizRepository;
        this.questionClient = questionClient;
    }

    @Override
    public Quiz add(Quiz quiz) {
        return quizRepository.save(quiz);
    }

    @Override
    public List<Quiz> get() {
        List<Quiz> quizzes = quizRepository.findAll();

        return quizzes.stream().map(quiz -> {
            quiz.setQuentions(questionClient.getQuestionOfQuiz(quiz.getId()));
            return quiz;
        }).collect(Collectors.toList());
    }

    @Override
    public Quiz get(Long id) {
        Quiz quiz = quizRepository.findById(id).orElseThrow(() -> new RuntimeException("Quiz not found"));
        quiz.setQuentions(questionClient.getQuestionOfQuiz(quiz.getId()));
        return quiz;
    }
}
