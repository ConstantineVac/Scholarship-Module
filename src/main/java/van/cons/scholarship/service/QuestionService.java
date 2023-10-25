package van.cons.scholarship.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import van.cons.scholarship.entity.*;
import van.cons.scholarship.repository.QuestionRepository;

import java.util.List;

@Service
public class QuestionService implements IQuestionService {
    private final QuestionRepository questionRepository;

    @Autowired
    public QuestionService(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    @Override
    public List<Question> getQuestionsByStatus(QuestionStatus status) {
        // Retrieve a list of questions based on their status.
        return questionRepository.findByQuestionStatus(status);
    }

    @Override
    public List<Question> getQuestionsByCategory(Category category) {
        // Retrieve a list of questions based on their category.
        return questionRepository.findByCategory(category);
    }

    @Override
    public List<Question> getQuestionsBySubcategory(Subcategory subcategory) {
        // Retrieve a list of questions based on their subcategory.
        return questionRepository.findBySubcategory(subcategory);
    }

    @Override
    public List<Question> getQuestionsByType(QuestionType type) {
        // Retrieve a list of questions based on their type.
        return questionRepository.findByQuestionType(type);
    }
}
