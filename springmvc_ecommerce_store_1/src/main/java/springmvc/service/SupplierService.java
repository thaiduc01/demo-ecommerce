package springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import springmvc.entity.SupplierEntity;
import springmvc.repository.SupplierRepository;

@Service
public class SupplierService {

	@Autowired
	SupplierRepository supplierRepository;
	
	public void save(SupplierEntity supplier) {
		supplierRepository.save(supplier);
	}
	
	public List<SupplierEntity> getSupplierList(){
		return supplierRepository.getSupplierList();
	}
}