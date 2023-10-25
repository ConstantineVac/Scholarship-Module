package van.cons.scholarship.service;

import van.cons.scholarship.entity.*;

import java.util.List;

// IQuestionService interface defines the contract for question-related operations.
public interface IQuestionService {
    /**
     * Retrieve a list of questions based on their status.
     *
     * @param status The status of the questions to retrieve.
     * @return A list of Question objects with the provided status.
     */
    List<Question> getQuestionsByStatus(QuestionStatus status);

    /**
     * Retrieve a list of questions based on their category.
     *
     * @param category The category to filter questions by.
     * @return A list of Question objects associated with the given category.
     */
    List<Question> getQuestionsByCategory(Category category);

    /**
     * Retrieve a list of questions based on their subcategory.
     *
     * @param subcategory The subcategory to filter questions by.
     * @return A list of Question objects associated with the given subcategory.
     */
    List<Question> getQuestionsBySubcategory(Subcategory subcategory);

    /**
     * Retrieve a list of questions based on their type.
     *
     * @param type The type of the questions to retrieve.
     * @return A list of Question objects with the provided type.
     */
    List<Question> getQuestionsByType(QuestionType type);
}
