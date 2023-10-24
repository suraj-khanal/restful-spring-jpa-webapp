package com.suraj.rest.restfulwebservice.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.suraj.rest.restfulwebservice.user.Post;

public interface PostRepository extends JpaRepository<Post, Integer> {
	
	
}
