package springmvc.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import springmvc.entity.ProductEntity;
import springmvc.service.ProductService;

@Controller
public class PagingController {

	@Autowired
	ProductService productService;
	
	@RequestMapping(value="/product-list")
	public String listProduct(Model model) {
		
		List<ProductEntity> listProduct = productService.getAllProduct();
		model.addAttribute("listProduct", listProduct);
		model.addAttribute("currentPage", 1);
		model.addAttribute("totalPage", productService.getProductByPage(1).getTotalPages());
		model.addAttribute("totalItems", productService.getProductByPage(1).getTotalElements());
		model.addAttribute("listProduct", productService.getProductByPage(1).getContent());
		model.addAttribute("path", "product-list");
		return "product-list";
	}
	
	@GetMapping("/product-list/{page}")
	public String listProductsPaging(Model model, @PathVariable(name="page") int page) {
		
		model.addAttribute("currentPage", page);
		model.addAttribute("totalPage", productService.getProductByPage(page).getTotalPages());
		model.addAttribute("totalItems", productService.getProductByPage(page).getTotalElements());
		model.addAttribute("listProduct", productService.getProductByPage(page).getContent());
		model.addAttribute("path", "product-list");
		return "product-list";
	}
	
	@RequestMapping(value="/shop")
	public String listShop(Model model) {
		
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
		
		model.addAttribute("currentPage", 1);
		model.addAttribute("totalPage", productService.getProductByPage(1).getTotalPages());
		model.addAttribute("totalItems", productService.getProductByPage(1).getTotalElements());
		model.addAttribute("listProduct", productService.getProductByPage(1).getContent());
		model.addAttribute("path", "shop");
		return "shop";
	}
	
	@GetMapping("/shop/{page}")
	public String listShopPaging(Model model, @PathVariable(name="page") int page) {
		
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
		
		model.addAttribute("currentPage", page);
		model.addAttribute("totalPage", productService.getProductByPage(page).getTotalPages());
		model.addAttribute("totalItems", productService.getProductByPage(page).getTotalElements());
		model.addAttribute("listProduct", productService.getProductByPage(page).getContent());
		model.addAttribute("path", "shop");
		return "shop";
	}
}
