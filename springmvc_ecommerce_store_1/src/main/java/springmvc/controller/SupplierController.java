package springmvc.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springmvc.entity.ProductEntity;
import springmvc.entity.SupplierEntity;
import springmvc.service.ProductService;
import springmvc.service.SupplierService;

@Controller
public class SupplierController {

	@Autowired
	SupplierService supplierService;
	
	@Autowired
	ProductService productService;
	
	@RequestMapping(value="/addSupplier", method = RequestMethod.GET)
	public String index(Model model) {
		model.addAttribute("supplier", new SupplierEntity());
		return "addSupplier";
	}
	
	@RequestMapping(value="/doAddSupplier", method = RequestMethod.POST)
	public String doAddSupplier(@Valid @ModelAttribute(name="supplier") SupplierEntity supplier, BindingResult result, Model model) {
		if(result.hasErrors()) {
			model.addAttribute("supplier", supplier);
			return "addSupplier";
		}
		supplierService.save(supplier);
		List<ProductEntity> listProduct = productService.getAllProduct();
		model.addAttribute("listProduct", listProduct);
		return "product-list";
	}
}
