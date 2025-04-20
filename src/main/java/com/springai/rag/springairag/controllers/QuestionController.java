package com.springai.rag.springairag.controllers;

import com.springai.rag.springairag.model.Question;
import com.springai.rag.springairag.services.OpenAIServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springai.rag.springairag.model.Answer;

@RequiredArgsConstructor
@RestController
public class QuestionController {

    private final OpenAIServiceImpl openAIService;

    @PostMapping("/ask")
    public Answer askQuestion(@RequestBody Question question) {
        return openAIService.getAnswer(question);
    }

}