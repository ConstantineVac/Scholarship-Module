package van.cons.scholarship.service;

import van.cons.scholarship.entity.Answer;
import van.cons.scholarship.entity.Question;

import java.util.List;

// IAnswerService interface defines the contract for answer-related operations.
public interface IAnswerService {
    /**
     * Retrieve a list of answers for a specific question.
     *
     * @param question The question for which answers are to be retrieved.
     * @return A list of Answer objects associated with the given question.
     */
    List<Answer> getAnswersForQuestion(Question question);
}
