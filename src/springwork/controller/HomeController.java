package springwork.controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import springwork.dao.*;
import springwork.model.*;

@Controller
@RequestMapping("/")
@SessionAttributes("userkey")
public class HomeController {
	
	@RequestMapping("/")
	public ModelAndView firstpage() {
		ModelAndView mav = new ModelAndView("firstpage");
		return mav;
	}
}
//	
//	@RequestMapping(value = "/user_info", method=RequestMethod.POST)
//	public ModelAndView user_info(@RequestParam("username") String username, @RequestParam("password") String password, @RequestParam("email") String email ) 
//	{
//		ModelAndView mav = new ModelAndView("loginpage");
//		
//		mav.addObject("username",username);
//		mav.addObject("password",password);
//		mav.addObject("email",email);
//		
//		
//		return mav;
//	}
//	
//	 /*Very important Function*/
//	@ModelAttribute("customerkey")
//	public Customer setUpUserForm()
//	{ 
//				return new Customer();
//	}
//	
//	
//	@RequestMapping(value = "/customerInfo_confirm", method=RequestMethod.POST)
//	public ModelAndView userInfo_confirm(@ModelAttribute("customerkey")Customer c ) 
//	{	ModelAndView mav = new ModelAndView("account");
//		
//		return mav;
//	}
//	
//	
//	
//	
//	
//	
//	@RequestMapping(value = "/submit_changes", method=RequestMethod.POST)
//	public String user_info_changes(@ModelAttribute Customer c, @SessionAttribute("userkey") Customer ckey ) 
//	{	
//		if (c.getPassword().equals(ckey.getPassword()))
//		{
//			return "redirect:modify";
//		}
//		ckey.setPassword(c.getPassword());
//		return "account";
//	}
//
//}

//	private CustomerDAO customerDAO = new CustomerDAO();
//	private ComicsDAO comicsDAO = new ComicsDAO();
//	private ModelAndView mav = null;
//	private HttpSession session;
//	private Comics comic = new Comics();
//	private Character savedComics;
//	private Customer cust = new Customer();
//
//	@ModelAttribute("customerkey")
//	public Customer UserForm() {
//		return new Customer();
//	}
//
//	@RequestMapping("/register")
//	public ModelAndView register() {
//		ModelAndView mav = new ModelAndView("Register");
//
//		return mav;
//	}
//
//	/*
//	 * @InitBinder public void initBinder(WebDataBinder binder) { binder.set }
//	 */
//	@RequestMapping(value = "/process-register", method = RequestMethod.POST)
//	public ModelAndView register(@ModelAttribute("customerkey") @Valid Customer customer, BindingResult errors)
//			throws SQLException {
//		ModelAndView mav = null;
//
//		if (errors.hasErrors()) {
//
//			mav = new ModelAndView("Register");
//			System.out.println("testing");
//			return mav;
//		}
//
//		else {
//			customerDAO.registerCustomer(customer.getUserName(), customer.getPassword(), customer.getEmail());
//
//			mav = new ModelAndView("redirect:Customer");
//		}
//
//		return mav;
//	}
//
//	
//
//	@RequestMapping(value = "/process-login", method = RequestMethod.POST)
//	public ModelAndView login(@ModelAttribute("customerkey") @Valid Customer customer, BindingResult errors,
//			HttpServletRequest req) throws SQLException {
//		ModelAndView mav = null;
//
//		customer = customerDAO.login(customer.getEmail(), customer.getPassword());
//
//		if (customer != null) {
//			session = req.getSession();
//			session.setAttribute("customerkey", customer);
//
//			mav = new ModelAndView("redirect:Customer");
//		} else {
//			mav = new ModelAndView("Login");
//			session = req.getSession();
//			session.setAttribute("message", "Incorrect login information");
//		}
//
//		return mav;
//	}
//
//	@RequestMapping("/account")
//	public ModelAndView customer() {
//		mav = new ModelAndView("Customer");
//		return mav;
//	}
//
//	@RequestMapping("/firstpage")
//	public ModelAndView about() {
//		mav = new ModelAndView("About");
//		return mav;
//	}
//
//	@RequestMapping(value = "/modify", method = RequestMethod.POST)
//	public ModelAndView user_info_modify() {
//		ModelAndView mav = new ModelAndView("CustomerAccountModify");
//
//		return mav;
//	}
//
//	@RequestMapping(value = "/updatePassword", method = RequestMethod.POST)
//	public ModelAndView user_info_changes(@ModelAttribute Customer customer,
//			@SessionAttribute("customerkey") Customer ckey, ModelAndView mav) throws SQLException {
//		System.out.println("Welcome");
//		customer.setCustomerID(ckey.getCustomerID());
//
//		boolean isUpdated = customerDAO.updatePassword(customer);
//		if (isUpdated) {
//			System.out.println("OK");
//			mav.addObject("customer_details", customerDAO.getCustomerByID(ckey.getCustomerID()));
//			mav.setViewName("CustomerAccountModify");
//		}
//		return mav;
//	}
//
//	@RequestMapping("/comics")
//	public ModelAndView comicPage() {
//		mav = new ModelAndView("Comics");
//		return mav;
//	}
//
//	@RequestMapping(value = "Comics", method = RequestMethod.POST)
//	public ModelAndView comicssPage(@ModelAttribute("comickey") @Valid Comics comic, HttpServletRequest req)
//			throws SQLException {
//		mav = new ModelAndView("Comics");
//
//		return mav;
//	}
//
//	@RequestMapping("/account")
//	public ModelAndView savedComicsPage() {
//		mav = new ModelAndView("SavedComics");
//
//		return mav;
//	}
//
//	@RequestMapping(value = "select-save", method = RequestMethod.POST)
//	public ModelAndView comicsPage(@RequestParam("saved") Integer number, HttpServletRequest req) throws SQLException {
//		mav = new ModelAndView("Comics");
//
//		return mav;
//
//	}
//
//}
