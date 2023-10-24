package van.cons.scholarship.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import van.cons.scholarship.entity.Answer;
import van.cons.scholarship.entity.Question;

import java.util.List;

public interface AnswerRepository extends JpaRepository<Answer, Long> {

    // Fetch answers for a specific question
    List<Answer> findByQuestion(Question question);
}
