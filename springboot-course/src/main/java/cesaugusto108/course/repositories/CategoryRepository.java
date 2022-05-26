package cesaugusto108.course.repositories;

import cesaugusto108.course.entities.Category;
import cesaugusto108.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
