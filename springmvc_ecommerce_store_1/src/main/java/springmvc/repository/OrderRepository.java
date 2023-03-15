package springmvc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import springmvc.entity.OrderEntity;

@Repository
public interface OrderRepository extends PagingAndSortingRepository<OrderEntity, Integer> {

	@Query(value="SELECT * FROM orders", nativeQuery = true)
	List<OrderEntity> getAllOrder();
	
	@Query(value="select b from OrderEntity b where b.customers.customerName like %:keyword% or b.customers.customerPhone like %:keyword% or b.customers.customerAddress like %:keyword% or b.customers.customerEmail like %:keyword%")
	List<OrderEntity> findOrderByKeyword(@Param("keyword")String keyword);
	
}