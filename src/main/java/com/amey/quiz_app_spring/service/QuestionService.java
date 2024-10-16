package com.amey.quiz_app_spring.service;

import com.amey.quiz_app_spring.dao.QuestionDao;
import com.amey.quiz_app_spring.model.Question;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    QuestionDao questionDao;

    public List<Question> getAllQuestions() {
        return questionDao.findAll();
    }

    public List<Question> getQuestionsByCategory(String category) {
        return questionDao.findByCategory(category);
    }


    public String addQuestion(Question question) {
        questionDao.save(question);
        return "success";
    }


}
