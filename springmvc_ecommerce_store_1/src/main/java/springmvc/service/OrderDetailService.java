package springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springmvc.entity.OrderDetailEntity;
import springmvc.repository.OrderDetailRepository;

@Service
public class OrderDetailService {

	@Autowired
	OrderDetailRepository orderDetailRepository;
	
	public void save(OrderDetailEntity orderDetail) {
		orderDetailRepository.save(orderDetail);
	}
	
	public List<OrderDetailEntity> getAllOrderDetail(){
		return	orderDetailRepository.getAllOrderDetail();
	}
	
	public List<OrderDetailEntity> findOrderDetailByOrderId(int id){
		return orderDetailRepository.findOrderDetailByOrderId(id);
	}
}