package van.cons.scholarship.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import van.cons.scholarship.entity.Exam;
import van.cons.scholarship.entity.Question;

import java.util.Date;
import java.util.List;

public interface ExamRepository extends JpaRepository<Exam, Long> {

    // Fetch exams by name
    List<Exam> findByName(String name);

    // Fetch exams based on date
    List<Exam> findByDate(Date date);

    // Fetch exams by a specific question
    List<Exam> findByQuestions(Question question);
}
