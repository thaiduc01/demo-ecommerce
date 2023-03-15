package springmvc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import springmvc.entity.ProductEntity;

@Repository
public interface ProductRepository extends PagingAndSortingRepository<ProductEntity, Integer> {

	@Query(value="SELECT * FROM products", nativeQuery = true)
	List<ProductEntity> getAllProduct();
	
	@Query(value="SELECT b FROM ProductEntity b WHERE b.productName LIKE %:keyword% "
			+ "or b.productDescription LIKE %:keyword% "
			+ "or b.category.categoryName LIKE %:keyword% "
			+ "or b.productPrice LIKE %:keyword% ")
	List<ProductEntity> findProductByKeyword(@Param("keyword")String keyword);
		
	@Query(value="SELECT p FROM ProductEntity p WHERE p.sex like %:sex%")
	List<ProductEntity> findProductBySex(@Param("sex")String sex);
	
}