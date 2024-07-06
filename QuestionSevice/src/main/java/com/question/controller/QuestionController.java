package com.question.controller;

import com.question.entity.Quention;
import com.question.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @PostMapping
    public Quention create(@RequestBody Quention quention) {
        return questionService.create(quention);
    }

    @GetMapping
    public List<Quention> getAll() {
        return questionService.get();
    }

    @GetMapping("/{questionId}")
    public Quention getOne(@PathVariable Long questionId) {
        return questionService.getOne(questionId);
    }


    @GetMapping("/quiz/{quizId}")
    public  List<Quention> getQuestionsOfQuiz(@PathVariable Long quizId){
        return questionService.getQuestionsOfQuiz(quizId);

    }
}
