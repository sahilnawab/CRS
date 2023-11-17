package com.complaint.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Tickets {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String title;
	private String description;
	private boolean isActive;
@ManyToMany(mappedBy = "raisedTickets",fetch = FetchType.EAGER)
	private  List<User> users=new ArrayList<>();
public Tickets() {
	// TODO Auto-generated constructor stub
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public boolean getIsActive() {
	return isActive;
}
public void setActive(boolean isActive) {
	this.isActive = isActive;
}
public List<User> getUsers() {
	return users;
}
public void setUsers(List<User> users) {
	this.users = users;
}
public Tickets(Long id, String title, String description, boolean isActive, List<User> users) {
	super();
	this.id = id;
	this.title = title;
	this.description = description;
	this.isActive = isActive;
	this.users = users;
}
public void addUser(User user) {
	users.add(user);
	// TODO Auto-generated method stub
	
}
}
