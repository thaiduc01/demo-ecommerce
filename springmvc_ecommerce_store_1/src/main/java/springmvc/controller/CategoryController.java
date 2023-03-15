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

import springmvc.entity.CategoryEntity;
import springmvc.entity.ProductEntity;
import springmvc.service.CategoryService;
import springmvc.service.ProductService;

@Controller
public class CategoryController {

	@Autowired
	CategoryService categoryService;
	
	@Autowired
	ProductService productService;
	
	@RequestMapping(value="/addCategory", method = RequestMethod.GET)
	public String index(Model model) {
		model.addAttribute("category", new CategoryEntity());
		return "addCategory";
	}
	/*******************************************************************************************************************************/
	@RequestMapping(value="/doAddCategory", method = RequestMethod.POST)
	public String doAddCategory(@Valid @ModelAttribute(name="category") CategoryEntity category, BindingResult result, Model model) {
		
		if(result.hasErrors()) {
			model.addAttribute("category", category);
			return "addCategory";
		}
		categoryService.save(category);
		List<ProductEntity> listProduct = productService.getAllProduct();
		model.addAttribute("listProduct",listProduct);
		return "product-list";
	}
}
