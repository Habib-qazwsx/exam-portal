package com.examportal.service.serviceImplement;

import com.examportal.model.exam.Quiz;
import com.examportal.repository.QuizRepository;
import com.examportal.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class QuizServiceImpl implements QuizService {

    @Autowired
    private QuizRepository quizRepository;

    @Override
    public Quiz addQuiz(Quiz quiz) {
        return this.quizRepository.save(quiz);
    }

    @Override
    public Quiz updateQuiz(Quiz quiz) {
        return this.quizRepository.save(quiz);
    }

    @Override
    public Set<Quiz> getAllQuiz() {
        return new HashSet<>(this.quizRepository.findAll());
    }

    @Override
    public Quiz getQuizByID(Long quizID) {
        return this.quizRepository.findById(quizID).get();
    }

    @Override
    public void deleteQuiz(Long quizID) {
        Quiz quiz = new Quiz();
        quiz.setQuizID(quizID);
        this.quizRepository.delete(quiz);
    }
}