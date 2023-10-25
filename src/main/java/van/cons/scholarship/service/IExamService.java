package van.cons.scholarship.service;

import van.cons.scholarship.entity.Exam;
import van.cons.scholarship.entity.Question;

import java.util.Date;
import java.util.List;

// IExamService interface defines the contract for exam-related operations.
public interface IExamService {
    /**
     * Retrieve a list of exams with a specific name.
     *
     * @param name The name of the exam to retrieve.
     * @return A list of Exam objects with the provided name.
     */
    List<Exam> getExamsByName(String name);

    /**
     * Retrieve a list of exams based on a specific date.
     *
     * @param date The date when exams were conducted.
     * @return A list of Exam objects conducted on the specified date.
     */
    List<Exam> getExamsByDate(Date date);

    /**
     * Retrieve a list of exams that contain a specific question.
     *
     * @param question The question to search for in exams.
     * @return A list of Exam objects that include the specified question.
     */
    List<Exam> getExamsByQuestion(Question question);
}
