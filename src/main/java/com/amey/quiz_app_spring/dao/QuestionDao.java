package com.amey.quiz_app_spring.dao;

import com.amey.quiz_app_spring.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionDao extends JpaRepository<Question,Integer> {

}
