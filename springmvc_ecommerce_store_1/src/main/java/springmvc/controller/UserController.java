package springmvc.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import springmvc.entity.ProductEntity;
import springmvc.entity.User;
//import springmvc.service.SendMailService;
import springmvc.service.UserService;

@Controller
public class UserController {

	@Autowired
	UserService userService;
//	
//	@Autowired
//	SendMailService sendMailService;
	
	@RequestMapping(value="/user-list")
	public String userList(Model model) {
		
		model.addAttribute("currentPage", 1);
		model.addAttribute("totalPage", userService.getUserByPage(1).getTotalPages());
		model.addAttribute("totalItems", userService.getUserByPage(1).getTotalElements());
		model.addAttribute("listUser", userService.getUserByPage(1).getContent());
		model.addAttribute("path", "user-list");
		
		List<User> listUser = userService.getAllUser();
		model.addAttribute("listUser", listUser);
		return "user-list";
	}
	
	@GetMapping("/user-list/{page}")
	public String listShopPaging(Model model, @PathVariable(name="page") int page) {
		
		model.addAttribute("currentPage", page);
		model.addAttribute("totalPage", userService.getUserByPage(page).getTotalPages());
		model.addAttribute("totalItems", userService.getUserByPage(page).getTotalElements());
		model.addAttribute("listUser", userService.getUserByPage(page).getContent());
		model.addAttribute("path", "user-list");
		return "user-list";
	}
	
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String registration(Model model) {
		model.addAttribute("user", new User());
		
		return "login-page";
	}
	
	@RequestMapping(value="/doRegistration", method=RequestMethod.POST)
	public ModelAndView doRegistration(@ModelAttribute("user") User user, BindingResult bindingResult, Model model) {
		
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
		
		ModelAndView modelAndView = new ModelAndView();
		User existingUser = userService.getByUserName(user.getUserName());
		if (existingUser!=null) {
			model.addAttribute("notification", "This username's already exists !!");
			modelAndView.setViewName("login-page");
		} else {			
			userService.save(user);
			//sendMailService.sendMail(user.getEmail(), "Welcome " + user.getEmail(), "Welcome " + user.getEmail() + " to become a member of our store");	
			modelAndView.setViewName ("home");
		}
		return modelAndView;
	}
	
	@PostMapping(value="/doLogin")
	public String doLogin(@ModelAttribute("user") User user, @RequestParam(name="username") String username, 
			@RequestParam(name="password") String password, Model model, HttpSession session) {

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
		
		User users = userService.getByUserName(username);
		if(users==null || users.getPassWord().equals(password)==false) {
			model.addAttribute("message", "Username/password is invalid");
			return "login-page";
			
		} else if ("admin".equals(username)&& "123456".equals(password)) {
			return "admin";
		}
		else {
			session.setAttribute("users", users.getUserName());
			return"home";
		}
	}
	
	@RequestMapping(value="/showProfile")
	public String showProfile(@RequestParam(name="username")String username, Model model){
		User user = userService.getByUserName(username);
		model.addAttribute("user", user);
		return"my-profile";
	}
	
	@RequestMapping(value="/updateUser")
	public String updateUser(@RequestParam(name="id")int id, Model model){
		Optional<User> opt_User = userService.findById(id);
		User user = opt_User.get();
		model.addAttribute("user", user);
		return"updateUser";
	}
	
	@RequestMapping(value="/doUpdateUser", method = RequestMethod.POST)
	public String doUpdateUser(@Valid @ModelAttribute(name="user") User user, BindingResult result, Model model) {
		if(result.hasErrors()) {
			model.addAttribute("user", user);
			return"updateUser";
		}
		userService.save(user);
		return "my-profile";
	}
	
	@RequestMapping(value="/logout", method = RequestMethod.POST)
	public String logout(HttpServletRequest request) {
		HttpSession session = request.getSession();
		session.invalidate();
		return "redirect:/home";
	}
	
	@RequestMapping(value="/deleteUser")
	public String deleteUser(@RequestParam(name="id") int id, Model model) {
		userService.delete(id);
		List<User> listUser = userService.getAllUser();
		model.addAttribute("listUser", listUser);
		return "user-list";
	}
	
	@RequestMapping(value="/doSearchUser")
	public String doSearchUser(@RequestParam(name="keyword")String keyword, Model model) {
				
		List<User> listUser = userService.findUserByKeyword(keyword);
		model.addAttribute("listUser", listUser);
		return "user-list";
	}
}
