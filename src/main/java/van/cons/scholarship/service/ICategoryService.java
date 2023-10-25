package van.cons.scholarship.service;

import van.cons.scholarship.entity.Category;
import van.cons.scholarship.entity.Question;

import java.util.List;

// ICategoryService interface defines the contract for category-related operations.
public interface ICategoryService {
    /**
     * Retrieve a category by its name.
     *
     * @param categoryName The name of the category to retrieve.
     * @return The Category object with the provided name, or null if not found.
     */
    Category getCategoryByName(String categoryName);

    /**
     * Retrieve a list of questions associated with a particular category.
     *
     * @param categoryName The name of the category to filter questions by.
     * @return A list of Question objects associated with the given category.
     */
    List<Question> getQuestionsByCategoryName(String categoryName);
}
