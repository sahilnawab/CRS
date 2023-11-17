package com.complaint.exception;

public class UserNotFoundException extends RuntimeException {
	String decs;
public UserNotFoundException(String desc) {
	super(desc);
}	
}
