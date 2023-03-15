package springmvc.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import springmvc.entity.Account;
import springmvc.entity.CreditCardEntity;
import springmvc.entity.CustomerEntity;
import springmvc.entity.Method;
import springmvc.entity.OrderDetailEntity;
import springmvc.entity.OrderEntity;
import springmvc.entity.ProductEntity;
import springmvc.service.AccountService;
import springmvc.service.CreditCardService;
import springmvc.service.CustomerService;
import springmvc.service.MethodService;
import springmvc.service.OrderDetailService;
import springmvc.service.OrderService;
import springmvc.service.ProductService;
//import springmvc.service.SendMailService;

@Controller
public class CartController {

	@Autowired
	OrderService orderService;
	
	@Autowired
	ProductService productService;
	
	@Autowired
	OrderDetailService orderDetailService;
	
	@Autowired
	AccountService accountService;
	
	@Autowired
	CreditCardService creditCardService;
	
	@Autowired
	CustomerService customerService;
	
	@Autowired
	MethodService methodService;
	
//	@Autowired
//	SendMailService sendMailService;
	
	@RequestMapping(value = "/addToCart", method = RequestMethod.POST)
	public String addToCart(@RequestParam(name = "orderdetail_id") int orderdetail_id,
							@RequestParam(name = "order_quantity") int order_quantity, HttpSession session, Model model) {
		
		@SuppressWarnings("unchecked")
		List<OrderDetailEntity> orderDetailList = (List<OrderDetailEntity>) session.getAttribute("cart");
		if (orderDetailList == null) {
			orderDetailList = new ArrayList<OrderDetailEntity>();
		}
		boolean tmp = false;
		for (OrderDetailEntity order : orderDetailList) {
			if (order.getProducts().getProductID() == orderdetail_id) {
				tmp = true;
				order.setOrder_quantity(order.getOrder_quantity() + order_quantity);
			}
		}
		if (!tmp) {
			OrderDetailEntity order = new OrderDetailEntity();
			ProductEntity productOpt = productService.findById(orderdetail_id).get();
			order.setProducts(productOpt);
			order.setOrder_quantity(order_quantity);
			orderDetailList.add(order);
		}
		session.setAttribute("cart", orderDetailList);
		return "redirect:/shop";
	}
	/*******************************************************************************************************************************/
	@RequestMapping(value = "/increaseQuantity", method = RequestMethod.POST)
	public String increaseQuantity(@RequestParam(name = "orderdetail_id") int orderdetail_id,
								   @RequestParam(name = "order_quantity") int order_quantity, HttpSession session, Model model) {
		
		@SuppressWarnings("unchecked")
		List<OrderDetailEntity> orderDetailList = (List<OrderDetailEntity>) session.getAttribute("cart");
		if (orderDetailList == null) {
			orderDetailList = new ArrayList<OrderDetailEntity>();
		}
		for (OrderDetailEntity order : orderDetailList) {
			if (order.getProducts().getProductID() == orderdetail_id) {
				order.setOrder_quantity(order.getOrder_quantity() + order_quantity);
			}
		}
		session.setAttribute("cart", orderDetailList);
		return "redirect:/shoping-cart";
	}
	/*******************************************************************************************************************************/
	@RequestMapping(value = "/decreaseQuantity", method = RequestMethod.POST)
	public String decreaseQuantity(@RequestParam(name = "orderdetail_id") int orderdetail_id,
								   @RequestParam(name = "order_quantity") int order_quantity, HttpSession session, Model model) {
		
		@SuppressWarnings("unchecked")
		List<OrderDetailEntity> orderDetailList = (List<OrderDetailEntity>) session.getAttribute("cart");
		if (orderDetailList == null) {
			orderDetailList = new ArrayList<OrderDetailEntity>();
		}
		for (OrderDetailEntity order : orderDetailList) {
			if (order.getProducts().getProductID() == orderdetail_id) {
				order.setOrder_quantity(order.getOrder_quantity() - order_quantity);
			}
		}
		session.setAttribute("cart", orderDetailList);
		return "redirect:/shoping-cart";
	}
	/*******************************************************************************************************************************/
	@RequestMapping(value = "/removeFromCart", method = RequestMethod.POST)
	public String removeFromCart(@RequestParam(name = "orderdetail_id") int orderdetail_id, HttpSession session, Model model) {
		
		@SuppressWarnings("unchecked")
		List<OrderDetailEntity> orderDetailList = (List<OrderDetailEntity>) session.getAttribute("cart");
		if (orderDetailList == null) {
			orderDetailList = new ArrayList<OrderDetailEntity>();
		}
		int index = this.exists(orderdetail_id, orderDetailList);
		orderDetailList.remove(index);
		session.setAttribute("cart", orderDetailList);
		return "redirect:/shoping-cart";
	}
	/*******************************************************************************************************************************/
	private int exists(int orderdetail_id, List<OrderDetailEntity> orderDetailList) {
		for (int i = 0; i < orderDetailList.size(); i++) {
			if (orderDetailList.get(i).getProducts().getProductID() == orderdetail_id) {
				return i;
			}
		}
		return -1;
	}
	/*******************************************************************************************************************************/
	@RequestMapping(value = "/checkout", method = RequestMethod.POST)
	public String checkout(Model model, HttpSession session, HttpServletRequest request) {
		
		@SuppressWarnings("unchecked")
		List<OrderDetailEntity> orderDetailList = (List<OrderDetailEntity>) session.getAttribute("cart");
		if (orderDetailList != null && orderDetailList.size() > 0) {
			Method method = new Method();
			method.setMethod_way(request.getParameter("method_way"));
			if ("cash".equalsIgnoreCase(method.getMethod_way())) {
				model.addAttribute("account", new Account());
				methodService.save(method);
				return "paidbycash";
			} else {
				model.addAttribute("account", new Account());
				methodService.save(method);
				return "paidbycard";
			}
		} else {
			model.addAttribute("error", "No product in shopping cart !!!");
			return "shoping-cart";
		}
	}
	/*******************************************************************************************************************************/
	@RequestMapping(value ="/doCash", method = RequestMethod.POST)
	public String doCash( HttpServletRequest request, HttpSession session, Model model) {
		
		@SuppressWarnings("unchecked")
		List<OrderDetailEntity> orderDetailList = (List<OrderDetailEntity>) session.getAttribute("cart");
		CustomerEntity customer = new CustomerEntity();
		OrderEntity order = new OrderEntity();
		order.setOrder_details(orderDetailList);
		order.setOrder_status("ordered");
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		order.setOrder_date(now.format(formatter));
		order.setPayment_method("cash");
		customer.setCustomerName(request.getParameter("customerName"));
		customer.setCustomerPhone(request.getParameter("customerPhone"));
		customer.setCustomerAddress(request.getParameter("customerAddress"));
		customer.setCustomerEmail(request.getParameter("customerEmail"));
		order.setCustomers(customer);
		orderService.save(order);
//		sendMailService.sendMail(order.getCustomers().getCustomerEmail(), "Your order has been confirmed", 
//				"Thank " + order.getCustomers().getCustomerName() 
//				+ " for buying our products\n" + "If you have any questions, don't hesitate to contact us!");
		session.removeAttribute("cart");
		return "thanks";
	}
	/*******************************************************************************************************************************/
	@RequestMapping(value ="/doCard", method = RequestMethod.POST)
	public ModelAndView doCard(@ModelAttribute("account") Account account, BindingResult bindingResult,
			HttpServletRequest request, HttpSession session, Model model) {
		
		ModelAndView modelAndView = new ModelAndView();
		Account existingCard1 = accountService.getCardByName(account.getAcc_name());
		Account existingCard2 = accountService.getCardByNumber(account.getAcc_number());
		Account existingCard3 = accountService.getCardByMonth(account.getAcc_exp_month());
		Account existingCard4 = accountService.getCardByYear(account.getAcc_exp_year());
		Account existingCard5 = accountService.getCardByCVV(account.getAcc_cvv());
		
		if (existingCard1 != null && existingCard2 != null && existingCard3 != null && existingCard4 != null && existingCard5 != null) {
			@SuppressWarnings("unchecked")
			List<OrderDetailEntity> orderDetailList = (List<OrderDetailEntity>) session.getAttribute("cart");
			CustomerEntity customer = new CustomerEntity();
			OrderEntity order = new OrderEntity();
			CreditCardEntity card = new CreditCardEntity();
			
			order.setOrder_status("ordered");
			LocalDateTime now = LocalDateTime.now();
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
			order.setOrder_date(now.format(formatter));
			order.setPayment_method("card");
			
			customer.setCustomerName(request.getParameter("customerName"));
			customer.setCustomerPhone(request.getParameter("customerPhone"));
			customer.setCustomerAddress(request.getParameter("customerAddress"));
			customer.setCustomerEmail(request.getParameter("customerEmail"));
			
			card.setCardholder_name(request.getParameter("acc_name"));
			card.setCard_number(request.getParameter("acc_number"));
			card.setExp_month(request.getParameter("acc_exp_month"));
			card.setExp_year(request.getParameter("acc_exp_year"));
			card.setCvv(request.getParameter("acc_cvv"));
			card.setPayment_date(now.format(formatter));
			
			order.setOrder_details(orderDetailList);
			order.setCustomers(customer);
			order.setCredit_cards(card);
			
			orderService.save(order);
//			sendMailService.sendMail(order.getCustomers().getCustomerEmail(), "Your order has been confirmed", 
//					"Thank " + order.getCustomers().getCustomerName() 
//					+ " for buying our products\n" + "If you have any questions, don't hesitate to contact us!");
			session.removeAttribute("cart");
			modelAndView.setViewName("thanks");
		} else {
			model.addAttribute("error", "Chi tiết thẻ của bạn không hợp lệ, vui lòng nhập lại !!");
			modelAndView.setViewName ("paidbycard");
		}
		return modelAndView;
	}
}
