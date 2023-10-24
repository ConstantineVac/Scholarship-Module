package van.cons.scholarship.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import van.cons.scholarship.entity.Question;
import van.cons.scholarship.entity.QuestionType;

import java.util.List;

public interface QuestionTypeRepository extends JpaRepository<QuestionType, Long> {

    // Fetch question types by their name (e.g., Multiple Choice, True/False, etc.)
    QuestionType findByTypeName(String typeName);

    // Fetch all questions associated with a particular question type
    List<Question> findQuestionsByTypeName(String typeName);
}
