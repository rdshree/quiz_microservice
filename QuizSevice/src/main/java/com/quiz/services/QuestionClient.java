package com.quiz.services;


import com.quiz.entity.Quention;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(url = "http://localhost:8082", value = "Question-Client")
public interface QuestionClient {

    @GetMapping("/question/quiz/{quizId}")
    List<Quention> getQuestionOfQuiz(@PathVariable("quizId") Long quizId);

}
