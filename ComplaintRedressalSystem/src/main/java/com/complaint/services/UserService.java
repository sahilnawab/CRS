package com.complaint.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.complaint.entity.ERole;
import com.complaint.entity.Tickets;
import com.complaint.entity.User;
import com.complaint.exception.UserNotFoundException;
import com.complaint.models.LoginModel;
import com.complaint.models.Ticketmodel;
import com.complaint.models.Usermodel;
import com.complaint.repos.TicketsReposatory;
import com.complaint.repos.UserReposatory;

@Service
public class UserService {	
	@Autowired
	UserReposatory repo;
	@Autowired
	TicketsReposatory trepo;

	public User createUser (Usermodel user) {
			User userofdb= new User();
			userofdb.setName(user.getName());
			userofdb.setEmail(user.getEmail());
			userofdb.setPassword(user.getPassword());
			userofdb.setRole(ERole.Customer);
			return repo.save(userofdb); 
		//		User savedUser=repo.save(user);
//		if(savedUser == null)
//		return false;
//		else return true;

	}
	public boolean deleteUser(Long id) {
		if(id != null) {
		repo.deleteById(id);
		return true;}
		else return false;
	}
	public List<User>  userList(){
		List <User> list= new ArrayList<>();
		list=repo.findAll();
		return list;
	}
	public User verifylogin(LoginModel model) {
		User user= repo.findByEmailAndPassword(model.getEmail(), model.getPassword());
	return user;
	
}
	public User getUserByEmail(String email) {
		return repo.findByEmail(email);
	}
	public User editUser(ERole role,String email) {
//		List<User> list= repo.findAll();
		User user= new User();
		user=repo.findByEmail(email);
		if(user!=null) {
			user.setRole(role);
		}else {
			throw new UserNotFoundException("user not found");
		}
		return user;
		
	}
	
	}
