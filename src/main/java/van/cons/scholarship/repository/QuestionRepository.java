package van.cons.scholarship.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import van.cons.scholarship.entity.*;

import java.util.List;

public interface QuestionRepository extends JpaRepository<Question, Long> {

    // Fetch questions based on their status
    List<Question> findByQuestionStatus(QuestionStatus status);

    // Fetch questions based on their category
    List<Question> findByCategory(Category category);

    // Fetch questions based on their subcategory
    List<Question> findBySubcategory(Subcategory subcategory);

    // Fetch questions based on their type
    List<Question> findByQuestionType(QuestionType type);
}