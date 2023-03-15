package springmvc.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import springmvc.entity.User;
import springmvc.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;
	
	public final int pagingNumber = 8;
	
	public User getByUserName(String username) {
		return userRepository.getUserByName(username);
	}
	
	public void save(User user) {
		userRepository.save(user);
	}
	
	public User getUserByNameAndPassWord(String username, String password) {
		return userRepository.getUserByNameAndPassWord(username, password);
	}
	
	public Optional<User> findById(int id) {
		return userRepository.findById(id);
	}
	
	public List<User> getAllUser(){
		return	userRepository.getAllUser();
	}
	
	public void delete(int id) {
		userRepository.deleteById(id);
	}
	
	@Transactional
	public Page<User> getUserByPage(int page){
		return userRepository.findAll(PageRequest.of(page - 1, pagingNumber));
	}
	
	public List<User> findUserByKeyword(String keyword){
		return userRepository.findUserByKeyword(keyword);
	}
}