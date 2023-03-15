package springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springmvc.entity.Method;
import springmvc.repository.MethodRepository;

@Service
public class MethodService {

	@Autowired
	MethodRepository methodRepository;
	
	public void save(Method method) {
		methodRepository.save(method);
	}
}