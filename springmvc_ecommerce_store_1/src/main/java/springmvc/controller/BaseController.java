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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.entity.ProductEntity;
import springmvc.service.ProductService;

@Controller
public class BaseController {
	
	@Autowired
	ProductService productService;

	@RequestMapping(value = "/home")
	public String home(Model model) {
		
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
		
		List<ProductEntity> listProduct = productService.getAllProduct();
		model.addAttribute("listProduct", listProduct);	
		return "home";
	}
	
	@RequestMapping(value = "/admin")
	public String admin(Model model) {
		
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
		return "admin";
	}
	
	
	
	@RequestMapping(value="/doShopSearch")
	public String doShopSearch(@RequestParam(name="keyword")String keyword, Model model) {
		
		List<ProductEntity> listProduct = productService.findProductByKeyword(keyword);
		model.addAttribute("listProduct", listProduct);
		return "shop";
	}
	
	@RequestMapping(value="/doSortSearch")
	public String doSortSearch(@RequestParam(name="keyword")String keyword, @RequestParam(name="sex") String sex, Model model) {
		
		List<ProductEntity> listProduct = productService.findProductBySex(sex);
		model.addAttribute("listProduct", listProduct);
		return "sort-by";
	}
	
	@RequestMapping(value = "/shoping-cart")
	public String cart(Model model) {
		
		List<ProductEntity> listProduct = productService.getAllProduct();
		model.addAttribute("listProduct", listProduct);	
		return "shoping-cart";
	}
}
