package springmvc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import springmvc.entity.ImageEntity;

@Repository
public interface ImageRepository extends CrudRepository<ImageEntity, Integer> {

	@Query(value="SELECT * FROM image", nativeQuery = true)
	List<ImageEntity> getAllImage();
	
}