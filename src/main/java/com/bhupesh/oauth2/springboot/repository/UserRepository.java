package com.bhupesh.oauth2.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bhupesh.oauth2.springboot.model.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	public User findByUsername(String userId);

}
