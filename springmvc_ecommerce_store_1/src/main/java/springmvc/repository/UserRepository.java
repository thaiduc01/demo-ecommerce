package springmvc.repository;

import java.util.List;



import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import springmvc.entity.User;

@Repository
public interface UserRepository extends PagingAndSortingRepository<User, Integer> {

	@Query("select u from User u where u.userName=?1")
	User getUserByName(String userName);
	
	@Query("select u from User u where u.userName=?1 and u.passWord=?2")
	User getUserByNameAndPassWord(String userName, String passWord);
		
	@Query(value="SELECT * FROM user", nativeQuery = true)
	List<User> getAllUser();
	
	@Query(value="SELECT u FROM User u WHERE u.userName LIKE %:keyword% ")
	List<User> findUserByKeyword(@Param("keyword")String keyword);
	
}