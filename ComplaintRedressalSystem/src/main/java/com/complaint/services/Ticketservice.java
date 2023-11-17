package com.complaint.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.complaint.entity.Tickets;
import com.complaint.entity.User;
import com.complaint.models.Ticketmodel;
import com.complaint.repos.TicketsReposatory;

@Service
public class Ticketservice {

	@Autowired
	private TicketsReposatory repo;
	
	public Tickets addNewTicket(Ticketmodel model ,User user) {
		Tickets ticket= new Tickets();
		ticket.setTitle(model.getTitle());
		ticket.setDescription(model.getDescription());
		ticket.setActive(true);
		user.addTickets(ticket);
		ticket.addUser(user);
		return repo.save(ticket);
}
	public List<Tickets> getAll(){
		List<Tickets>list = new ArrayList<>();
		list=repo.findAll();
		return list;
	}
}
