package springmvc.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import springmvc.entity.CreditCardEntity;

@Repository
public interface CreditCardRepository extends CrudRepository<CreditCardEntity, Integer> {

	
}