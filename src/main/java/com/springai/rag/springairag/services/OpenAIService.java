package com.springai.rag.springairag.services;

import com.springai.rag.springairag.model.Answer;
import com.springai.rag.springairag.model.Question;

public interface OpenAIService {
    Answer getAnswer(Question question);
}