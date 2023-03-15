package springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springmvc.entity.Account;
import springmvc.repository.AccountRepository;

@Service
public class AccountService {
	
	@Autowired
	AccountRepository accountRepository;
	
	public Account getCardByName(String accName) {
		return accountRepository.getCardByName(accName);
	}
	
	public Account getCardByNumber(Long accNumber) {
		return accountRepository.getCardByNumber(accNumber);
	}
	
	public Account getCardByMonth(Integer accExpMonth) {
		return accountRepository.getCardByMonth(accExpMonth);
	}
	
	public Account getCardByYear(Integer accExpYear) {
		return accountRepository.getCardByYear(accExpYear);	
	}
	
	public Account getCardByCVV(Integer accCVV) {
		return accountRepository.getCardByCVV(accCVV);
	}
	
	public void save(Account account) {
		accountRepository.save(account);
	}
}