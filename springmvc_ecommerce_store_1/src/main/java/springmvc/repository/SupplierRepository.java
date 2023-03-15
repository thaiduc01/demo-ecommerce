package springmvc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import springmvc.entity.SupplierEntity;

@Repository
public interface SupplierRepository extends CrudRepository<SupplierEntity, Integer> {

	@Query(value="SELECT * FROM supplier", nativeQuery = true)
	List<SupplierEntity> getSupplierList();
	
}