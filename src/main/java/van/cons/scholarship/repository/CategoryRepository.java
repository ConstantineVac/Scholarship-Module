package van.cons.scholarship.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import van.cons.scholarship.entity.Category;
import van.cons.scholarship.entity.Question;

public interface CategoryRepository extends JpaRepository<Category, Long> {

    // Fetch category by its name
    Category findByCategoryName(String categoryName);

    // Fetch all questions associated with a particular category
    List<Question> findQuestionsByCategoryName(String categoryName);

}