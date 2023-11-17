package com.complaint.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.complaint.entity.Tickets;
import com.complaint.entity.User;
import com.complaint.models.Ticketmodel;
import com.complaint.services.Ticketservice;
import com.complaint.services.UserService;


@Controller
public class TicketController {
	
	@Autowired
	Ticketservice service;
	@Autowired
	UserService userservice;
	
	//for creating new ticket
	@GetMapping("/ticket")
	public String showticket(){return "ticket";}
	
	//for showing all tickets by user
//		@GetMapping("/showtickets")
//		public String showAllTickets() {return "showtickets";}
		
		
	@PostMapping("/newticket")
	public String newTicket(@RequestParam String title, @RequestParam  String  description,Model model,HttpSession session) {
				Ticketmodel ticketofview=new Ticketmodel(title, description);
				User user= (User)session.getAttribute("user");
				User user1= userservice.getUserByEmail(user.getEmail());
				String viewname;
				if(service.addNewTicket(ticketofview,user1)!=null) {
					model.addAttribute("ticket", "Ticket added, Coustmer Support will reach you Shortly");
					return viewname="customerDashboard";
				}
				else {
					viewname="error";
						model.addAttribute("error", "ticket was not saved");
					
				}
				return viewname;	
	}
	@GetMapping("/showtickets")
	public String ViewAllTickets(Model model) {
		List<Tickets>list= service.getAll();
//		for (Tickets tickets : list) {
//			tickets.getId()
//		}
			model.addAttribute("list", list);
			return "customerDashboard";
	}
	
}
