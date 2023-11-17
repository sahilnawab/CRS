package com.complaint.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.complaint.entity.ERole;
import com.complaint.entity.User;
import com.complaint.models.LoginModel;
import com.complaint.models.Ticketmodel;
import com.complaint.models.Usermodel;
import com.complaint.services.UserService;

@Controller
public class HomeController {
	
	@Autowired
	UserService service;

	@GetMapping({ "/", "home" })
	public String home() {
		return "home";
	}
	@GetMapping("/register")
	public String register(){
		return "register";
	}
	@GetMapping("/support")
	public String showsupport(){
		return "support1";
	}
	@GetMapping("/aboutus")
	public String showabout(){
		return "aboutus";
	}
	@GetMapping("useredit")
	public String showuseredit(Model model ){
			List<User>list= service.userList();
		model.addAttribute("list", list);
		return "useredit";
	}
//	@GetMapping("/userlist")
//	public String getList(Model model){
//		model.addAttribute("list", service.userList());
//		return "userlist";
//	}
//	@PostMapping("/createuser")
//	public String createUser(@RequestBody User user , Model model,RedirectAttributes redirect)  {
//		
//		if( service.createUser(user)) {
//			redirect.addFlashAttribute("message", "Success");
//				return "register";
//		}else { 
//			redirect.addFlashAttribute("message", "somthing wrong happened");
//			return "redirect:/userlist";}
//	}
	@PostMapping("/createuser")
	
	public String register(@RequestParam String name
										,@RequestParam String email,
										@RequestParam String password,
											Model model) {
		String viewname;
		Usermodel usermodel= new Usermodel(name,email,password);
		if(service.createUser(usermodel)!=null) {
			model.addAttribute("msg", "user registered");
			viewname="redirect:/home";
		}
		else {
			model.addAttribute("msg", "user is not registered");
			viewname="register";
		}
		return viewname;
	}	
	
	@PostMapping("/login")
		public String login(@RequestParam  String email,@RequestParam  String password,Model model,HttpSession session) {
		String viewname;
		LoginModel userofview=new LoginModel();
			userofview.setEmail(email);
			userofview.setPassword(password);
			User user= service.verifylogin(userofview);
				if(user==null) {
				model.addAttribute("msg", "user or password is wrong");	
				viewname="home";
				}
				else{
						session.setAttribute("user", user);
						if(user.getRole().equals(user.getRole().Customer)) {
						viewname="customerDashboard";
						}
						else if(user.getRole().equals("Engineer")) {
							viewname="EngineerDashboard";
						}
						else if(user.getRole().equals(user.getRole().Admin)) {
							viewname="admindashboard";
						}
						else {
							model.addAttribute("role", "Role not provided please contact Admin");
							viewname="register";
						}
						
				}
				return viewname;
	}
	
	
	
	
	
	@DeleteMapping("/deleteuser/{id}")
		public String deleteUser(@PathVariable Long id ,RedirectAttributes redirect) {
			if(service.deleteUser(id)) {
					redirect.addFlashAttribute("message","deleted");
			}
			else redirect.addFlashAttribute("massage","delete failure");
				return  "redirect:/userlist";
		}
	@PostMapping("/change")
	public String updateUserRole(@RequestParam ERole role,@RequestParam String email, HttpSession session, Model model) {
				User user=service.editUser(role,email);
				String viewname;
			if(user!=null) {
			 model.addAttribute("msgofupdate" ,"user updated succsesfully");
			 viewname="redirect:/admindashboard";
			 model.addAttribute("email", email);
			}else {
			viewname="error";
			}
	return viewname;
	}		
	
	@GetMapping("/update/{email}")
	public String showedit() {
		return "useredit1";
	}

}
