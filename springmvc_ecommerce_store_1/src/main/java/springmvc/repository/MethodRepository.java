package springmvc.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import springmvc.entity.Method;

@Repository
public interface MethodRepository extends CrudRepository<Method, Integer> {

	
}