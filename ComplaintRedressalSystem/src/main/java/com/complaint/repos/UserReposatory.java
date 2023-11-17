package com.complaint.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.complaint.entity.ERole;
import com.complaint.entity.User;

@Repository
public interface UserReposatory extends JpaRepository<User, Long> {
	 User findByEmailAndPassword(String email,String Password) ;
	User findByEmail(String email);
	User findByRole(ERole role);
}
