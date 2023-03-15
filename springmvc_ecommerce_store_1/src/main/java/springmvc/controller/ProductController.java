package springmvc.controller;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import springmvc.entity.CategoryEntity;
import springmvc.entity.ImageEntity;
import springmvc.entity.ProductEntity;
import springmvc.entity.SupplierEntity;
import springmvc.service.CategoryService;
import springmvc.service.ProductService;
import springmvc.service.SupplierService;

@Controller
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@Autowired
	CategoryService categoryService;
	
	@Autowired
	SupplierService supplierService;
	
	@RequestMapping(value="/addProduct", method = RequestMethod.GET)
	public String index(Model model) {
		model.addAttribute("product", new ProductEntity());
		try {
			List<CategoryEntity> listCategory = categoryService.getCategoryList();
			model.addAttribute("listCategory", listCategory);
			} catch (Exception e) {
				model.addAttribute("listCategory", new ArrayList<CategoryEntity>());
			}
		try {
			List<SupplierEntity> listSupplier = supplierService.getSupplierList();
			model.addAttribute("listSupplier", listSupplier);
			} catch (Exception e) {
				model.addAttribute("listSupplier", new ArrayList<SupplierEntity>());
			}
			return "addProduct";
	}
	
	@RequestMapping(value="/doAddProduct", method = RequestMethod.POST)
	public String doAddProduct(@Valid @ModelAttribute(name="product") ProductEntity product, BindingResult result, Model model,
			HttpServletRequest request) {
		
		if(result.hasErrors()) {
			model.addAttribute("product", product);
			try {
				List<CategoryEntity> listCategory = categoryService.getCategoryList();
				model.addAttribute("listCategory", listCategory);
				} catch (Exception e) {
					model.addAttribute("listCategory", new ArrayList<CategoryEntity>());
				}
			try {
				List<SupplierEntity> listSupplier = supplierService.getSupplierList();
				model.addAttribute("listSupplier", listSupplier);
				} catch (Exception e) {
					model.addAttribute("listSupplier", new ArrayList<SupplierEntity>());
				}
			return "addProduct";
		}
		
		
		String saveDir = "WEB-INF\\resources\\fileUpload\\";
		String savePath = request.getServletContext().getRealPath("")+saveDir;
		List<ImageEntity> listImage = new ArrayList<ImageEntity>();
		
		List<MultipartFile> multiparFile = product.getMultipartFile();
		ImageEntity imageEntity;
		for(MultipartFile fi: multiparFile) {
			imageEntity = new ImageEntity();
			String fileName = fi.getOriginalFilename();
			File file = new File(savePath, fileName);
			try {
				fi.transferTo(file);
				imageEntity.setPath("resources/fileUpload/"+fileName);
				listImage.add(imageEntity);
			} catch (IllegalStateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		product.setImage(listImage);
		productService.save(product);
		List<ProductEntity> listProduct = productService.getAllProduct();
		model.addAttribute("listProduct",listProduct);
		
		model.addAttribute("currentPage", 1);
		model.addAttribute("totalPage", productService.getProductByPage(1).getTotalPages());
		model.addAttribute("totalItems", productService.getProductByPage(1).getTotalElements());
		model.addAttribute("listProduct", productService.getProductByPage(1).getContent());
		model.addAttribute("path", "product-list");
		
		return "product-list";
	}
	
	@RequestMapping(value="/updateProduct")
	public String showUpdateProduct(@RequestParam(name="id")int id, Model model ) {
		Optional<ProductEntity> opt_Product = productService.findById(id);
		ProductEntity product = opt_Product.get();
		model.addAttribute("product", product);
		//Send category to addProduct
		try { 
			List<CategoryEntity> listCategory = categoryService.getCategoryList();
			model.addAttribute("listCategory",listCategory);
		} catch(Exception e){
			
		}
		try {
			List<SupplierEntity> listSupplier = supplierService.getSupplierList();
			model.addAttribute("listSupplier", listSupplier);
		} catch (Exception e) {
			
		}
		return "updateProduct";
	}
	
	@RequestMapping(value="/doUpdateProduct", method = RequestMethod.POST)
	public String doUpdateProduct(@Valid @ModelAttribute(name="product") ProductEntity product,BindingResult result, Model model, 
			HttpServletRequest request) {
		if(result.hasErrors()) {
			model.addAttribute("product",product);
			try { 
				List<CategoryEntity> listCategory = categoryService.getCategoryList();
				model.addAttribute("listCategory",listCategory);
			} catch(Exception e){
				
			}
			try {
				List<SupplierEntity> listSupplier = supplierService.getSupplierList();
				model.addAttribute("listSupplier", listSupplier);
			} catch (Exception e) {
				
			}
			return "updateProduct";
		}
		String saveDir = "WEB-INF\\resources\\fileUpload\\";
		String savePath = request.getServletContext().getRealPath("")+saveDir;
		List<ImageEntity> listImage = new ArrayList<ImageEntity>();
		
		List<MultipartFile> multiparFile = product.getMultipartFile();
		ImageEntity imageEntity;
		for(MultipartFile fi: multiparFile) {
			imageEntity = new ImageEntity();
			String fileName = fi.getOriginalFilename();
			File file = new File(savePath, fileName);
			try {
				fi.transferTo(file);
				imageEntity.setPath("resources/fileUpload/"+fileName);
				listImage.add(imageEntity);
			} catch (IllegalStateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		product.setImage(listImage);
		productService.save(product);
		List<ProductEntity> listProduct = productService.getAllProduct();
		model.addAttribute("listProduct", listProduct);
		return "product-list";
	}
	
	@RequestMapping(value="/deleteProduct")
	public String deleteProduct(@RequestParam(name="id") int id, Model model) {
		
		productService.delete(id);
		List<ProductEntity> listProduct = productService.getAllProduct();
		model.addAttribute("listProduct", listProduct);
		return "product-list";
	}
	
	@RequestMapping(value="/doSearch")
	public String doSearch(@RequestParam(name="keyword")String keyword, Model model) {
				
		List<ProductEntity> listProduct = productService.findProductByKeyword(keyword);
		model.addAttribute("listProduct", listProduct);
		return "product-list";
	}
	
	@RequestMapping(value="/sort-by")
	public String listMen(@RequestParam(name="sex") String sex, Model model) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("EEEE");
		Date date = new Date();
		String dayOfTheWeek = sdf.format(date);
		model.addAttribute("dayOfTheWeek", dayOfTheWeek);
		
		Calendar cal1 = Calendar.getInstance();
		String month = cal1.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.getDefault());
		model.addAttribute("month", month);
		
		Calendar cal2 = Calendar.getInstance();
		int day = cal2.get(Calendar.DATE);
		model.addAttribute("day", day);
		
		DateFormat dateFormat = new SimpleDateFormat("hh:mm a");
		Calendar cal3 = Calendar.getInstance();
		String time = dateFormat.format(cal3.getTime());
		model.addAttribute("time", time);
		
		List<ProductEntity> listProduct = productService.findProductBySex(sex);
		model.addAttribute("listProduct", listProduct);
		
		return "sort-by";
	}
	
	@RequestMapping(value="/product-detail")
	public String showProductDetail(@RequestParam(name="id")int id, Model model ) {
		Optional<ProductEntity> opt_Product = productService.findById(id);
		ProductEntity product = opt_Product.get();
		model.addAttribute("product", product);
		
		List<ProductEntity> listProduct = productService.getAllProduct();
		model.addAttribute("listProduct",listProduct);
		return "product-detail";
	}
	
	
}
