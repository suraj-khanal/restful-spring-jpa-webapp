package com.suraj.rest.restfulwebservice.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.suraj.rest.restfulwebservice.user.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	
	
}
