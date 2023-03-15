package springmvc.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import springmvc.entity.ProductEntity;
import springmvc.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	ProductRepository productRepository;
	
	public final int pagingNumber = 8;
	
	public void save(ProductEntity product) {
		productRepository.save(product);
	}
	
	public List<ProductEntity> getAllProduct(){
	return	productRepository.getAllProduct();
	}
	
	public Optional<ProductEntity> findById(int id){
		return productRepository.findById(id);
	}
	
	public void delete(int id) {
		productRepository.deleteById(id);
	}
	
	public List<ProductEntity> findProductByKeyword(String keyword){
		return productRepository.findProductByKeyword(keyword);
	}
	
	@Transactional
	public Page<ProductEntity> getProductByPage(int page){
		return productRepository.findAll(PageRequest.of(page - 1, pagingNumber));
	}
	
	public List<ProductEntity> findProductBySex(String sex){
		return productRepository.findProductBySex(sex);
	}
}