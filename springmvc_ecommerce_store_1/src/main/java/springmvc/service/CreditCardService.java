package springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springmvc.entity.CreditCardEntity;
import springmvc.repository.CreditCardRepository;

@Service
public class CreditCardService {

	@Autowired
	CreditCardRepository creditCardRepository;
	
	public void save(CreditCardEntity card) {
		creditCardRepository.save(card);
	}
}