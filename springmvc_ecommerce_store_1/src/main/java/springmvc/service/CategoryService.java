package springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springmvc.entity.CategoryEntity;
import springmvc.repository.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	CategoryRepository categoryRepository;
	
	public void save(CategoryEntity category) {
		categoryRepository.save(category);
	}
	
	public List<CategoryEntity> getCategoryList(){
		return categoryRepository.getCategoryList();
	}
}