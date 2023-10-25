package van.cons.scholarship.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import van.cons.scholarship.entity.Category;
import van.cons.scholarship.entity.Question;
import van.cons.scholarship.repository.CategoryRepository;

import java.util.List;

@Service
public class CategoryService implements ICategoryService {
    private final CategoryRepository categoryRepository;

    @Autowired
    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public Category getCategoryByName(String categoryName) {
        // Retrieve a category by its name.
        return categoryRepository.findByCategoryName(categoryName);
    }

    @Override
    public List<Question> getQuestionsByCategoryName(String categoryName) {
        // Retrieve a list of questions associated with a particular category.
        return categoryRepository.findQuestionsByCategoryName(categoryName);
    }
}