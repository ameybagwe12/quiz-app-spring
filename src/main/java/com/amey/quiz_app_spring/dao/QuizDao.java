package com.amey.quiz_app_spring.dao;

import com.amey.quiz_app_spring.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizDao extends JpaRepository<Quiz, Integer> {
}
