package springmvc.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import springmvc.entity.OrderEntity;
import springmvc.repository.OrderRepository;

@Service
public class OrderService {

	@Autowired
	OrderRepository orderRepository;
	
	public final int pagingNumber = 8;
	
	public void save(OrderEntity order) {
		orderRepository.save(order);
	}
	
	public List<OrderEntity> getAllOrder(){
		return	orderRepository.getAllOrder();
	}
	
	public Optional<OrderEntity> findById(int id){
		return orderRepository.findById(id);
	}
	
	public List<OrderEntity> findOrderByKeyword(String keyword){
		return orderRepository.findOrderByKeyword(keyword);
	}
	
	@Transactional
	public Page<OrderEntity> getOrderByPage(int page){
		return orderRepository.findAll(PageRequest.of(page - 1, pagingNumber));
	}
}