package springmvc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import springmvc.entity.OrderDetailEntity;

@Repository
public interface OrderDetailRepository extends CrudRepository<OrderDetailEntity, Integer> {

	@Query(value="SELECT * FROM order_details", nativeQuery = true)
	List<OrderDetailEntity> getAllOrderDetail();
	
	@Query(value="select b from OrderDetailEntity b where b.orders.order_id=:id")
	List<OrderDetailEntity> findOrderDetailByOrderId(@Param("id")int id);
	
}