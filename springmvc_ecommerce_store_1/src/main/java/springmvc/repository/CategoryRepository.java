package springmvc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import springmvc.entity.CategoryEntity;

@Repository
public interface CategoryRepository extends CrudRepository<CategoryEntity, Integer>{

	@Query(value="SELECT * FROM category", nativeQuery = true)
	List<CategoryEntity> getCategoryList();
	
}