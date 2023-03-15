package springmvc.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import springmvc.entity.Account;

@Repository
public interface AccountRepository extends CrudRepository<Account, Integer> {
	
	@Query("SELECT u FROM Account u WHERE u.acc_name=?1")
	Account getCardByName(String accName);
	
	@Query("SELECT u FROM Account u WHERE u.acc_number=?1")
	Account getCardByNumber(Long accNumber);
	
	@Query("SELECT u FROM Account u WHERE u.acc_exp_month=?1")
	Account getCardByMonth(Integer accExpMonth);
	
	@Query("SELECT u FROM Account u WHERE u.acc_exp_year=?1")
	Account getCardByYear(Integer accExpYear);
	
	@Query("SELECT u FROM Account u WHERE u.acc_cvv=?1")
	Account getCardByCVV(Integer accCVV);
	
}