package springmvc.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.entity.OrderDetailEntity;
import springmvc.entity.OrderEntity;
import springmvc.service.OrderDetailService;
import springmvc.service.OrderService;

@Controller
public class OrderController {

	@Autowired
	OrderService orderService;
	
	@Autowired
	OrderDetailService orderDetailService;
	
	@RequestMapping(value="/order-list")
	public String listOrder(Model model) {
		
		List<OrderEntity> listOrder = orderService.getAllOrder();
		model.addAttribute("listOrder", listOrder);
		model.addAttribute("currentPage", 1);
		model.addAttribute("totalPage", orderService.getOrderByPage(1).getTotalPages());
		model.addAttribute("totalItems", orderService.getOrderByPage(1).getTotalElements());
		model.addAttribute("listOrder", orderService.getOrderByPage(1).getContent());
		model.addAttribute("path", "order-list");
		return "order-list";
	}
	
	@GetMapping("/order-list/{page}")
	public String listProductsPaging(Model model, @PathVariable(name="page") int page) {
		
		model.addAttribute("currentPage", page);
		model.addAttribute("totalPage", orderService.getOrderByPage(page).getTotalPages());
		model.addAttribute("totalItems", orderService.getOrderByPage(page).getTotalElements());
		model.addAttribute("listOrder", orderService.getOrderByPage(page).getContent());
		model.addAttribute("path", "order-list");
		return "order-list";
	}
	
	@RequestMapping(value="/order-detail")
	public String showOrderDetail(@RequestParam(name="id")int id, Model model) {
		List<OrderDetailEntity> listOrderDetail = orderDetailService.findOrderDetailByOrderId(id);
		model.addAttribute("listOrderDetail", listOrderDetail);
		
		List<OrderEntity> listOrder = orderService.getAllOrder();
		model.addAttribute("listOrder", listOrder);
		return "order-detail";
	}
	
//	@RequestMapping(value="/updateOrder")
//	public String showUpdateOrder(@RequestParam(name="id")int id, Model model ) {
//		Optional<OrderEntity> opt_Order = orderService.findById(id);
//		OrderEntity order = opt_Order.get();
//		model.addAttribute("order", order);
//		return "updateOrder";
//	}
//	
//	@RequestMapping(value="/doUpdateOrder", method = RequestMethod.POST)
//	public String doUpdateOrder(@Valid @ModelAttribute(name="order") OrderEntity order, BindingResult result, Model model) {
//		if(result.hasErrors()) {
//			model.addAttribute("order", order);
//			return "updateOrder";
//		}
//		orderService.save(order);
//		List<OrderEntity> listOrder = orderService.getAllOrder();
//		model.addAttribute("listOrder", listOrder);		
//		return "order-list";
//	}
	
	@RequestMapping(value="/doOrderSearch")
	public String doOrderSearch(@RequestParam(name="keyword")String keyword, Model model) {
				
		List<OrderEntity> listOrder = orderService.findOrderByKeyword(keyword);
		model.addAttribute("listOrder", listOrder);
		return "order-list";
	}
}
