package van.cons.scholarship.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import van.cons.scholarship.entity.Category;
import van.cons.scholarship.entity.Question;
import van.cons.scholarship.entity.Subcategory;

import java.util.List;

public interface SubcategoryRepository extends JpaRepository<Subcategory, Long> {

    // Fetch subcategories based on their main category
    List<Subcategory> findByCategory(Category category);

    // Fetch all questions associated with a particular subcategory
    List<Question> findQuestionsBySubcategoryName(String subcategoryName);
}