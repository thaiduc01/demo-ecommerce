package springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springmvc.entity.CustomerEntity;
import springmvc.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	CustomerRepository customerRepository;
	
	public void save(CustomerEntity customer) {
		customerRepository.save(customer);
	}
}